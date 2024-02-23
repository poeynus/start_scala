> 1편과 동일하게 실시간 데이터를 처리하며 다룬 내용입니다.
>
> 이미 현재 시점의 실시간 교차로 신호 운영 현황 RabbitMQ는 구축 되어 있습니다.
>
> 고도화에서는 해당 데이터를 사용하여 화면에 교차로 신호(이동류)를 표현 하는 것이 목표입니다.

- [사전 설명](#사전-설명)
    * [Code Link](#code-link)
    * [실시간 교차로 신호 운영 현황](#실시간-교차로-신호-운영-현황)
    * [이동류](#이동류)
    * [실시간 교차로 신호 운영 현황 queue 데이터](#실시간-교차로-신호-운영-현황-queue-데이터)
    * [MQTT Protocol](#mqtt-protocol)
    * [데이터 규격 및 분석 방법](#데이터-규격-및-분석-방법)
    * [파일 구조](#파일-구조)
    * [DB에 교차로 이동류 정보 적재](#db에-교차로-이동류-정보-적재)
- [흐름도](#---)
- [상세](#--)
    * [MQTT Service 실행](#mqtt-service-실행)
    * [Api를 사용한 apiToken, otp 정보 획득](#api를-사용한-apitoken--otp-정보-획득)
    * [psycopg2를 사용한 교차로 이동류 정보 조회](#psycopg2를-사용한-교차로-이동류-정보-조회)
    * [Message 가공](#message-가공)
    * [MQTT Publish](#mqtt-publish)

---

# 사전 설명
## Code Link

[GIGP Real Time Signal Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/tree/master/rabbitmq/signal_service)

## 실시간 교차로 신호 운영 현황

현재 시점의 교차로 신호 운영 현황

## 이동류

신호의 모습을 그림으로 표현한 것

## 실시간 교차로 신호 운영 현황 queue 데이터
\xa1 데이터만 사용합니다. 긴급차량과는 다르게 body가 json이 아닌 byte로 되어 있습니다.

\xa1: 교차로 신호 운영 현황
```
b'GG\xa1\xa7\xa7\x00\x00\x00\x01\x00\x00\x00\x01\x00\x00\x00\x00e\xc1\x96\x93\x00\x00\x05\xaa\x18\xd6VaLL\x01\x00\x00\x00\x18\xd6Vbnn\x01\x00\x00\x00\x18\xd6VcII\x01\x00\x00\x00\x18\xd6Vd\x02\x02\x01\x00\x00\x00\x18\xd6Ve\x00\x00\x01\x00\x00\x00\x18\xd6Vftt\x01\x00\x00\x00\x18\xd6Vg\x01\x01\x01\x00\x00\x00\x18\xd6VhLL\x01\x00\x00\x00\x18\xd6Vi\x01\x01\x01\x00\x00\x00\x18\xd6Vj((\x01\x00\x00\x00\x18\xd6VkKK\x01\x00\x00\x00\x18\xd6VlJJ\x01\x00\x00\x00\x18\xd6VmHH\x01\x00\x00\x00\x18\xd6VnII\x81\x00\x00\x00\x18\xd6Vo\x00\x00\x80\x00\x00\x00\x18\xd6Vprr\x01\x00\x00\x00\x18\xd6Vq$$\x02\x00\x00\x00\x18\xd6VrGG\x02\x00\x00\x00\x18\xd6VsII\x01\x00\x00\x00\x18\xd6VtFF\x01\x00\x00\x00\x18\xd6Vu\x04\x04\x01\x00\x00\x00\x18\xd6VvII\x01\x00\x00\x00\x18\xd6Vw$$\x01\x00\x00\x00\x18\xd6Vx%%\x01\x00\x00\x00\x18\xd6Vy\'\'\x01\x00\x00\x00\x18\xd6VzFF\x02\x00\x00\x00\x18\xd6V{\x02\x02\x01\x00\x00\x00\x18\xd6V|&&\x01\x00\x00\x00\x18\xd6V}FF\x01\x00\x00\x00\x18\xd6V~\x01\x01\x01\x00\x00\x00\x18\xd6V\x7f\'\'\x01\x00\x00\x00\x18\xd6V\x80\x02\x02\x01\x00\x00\x00\x18\xd6V\x81\'\'\x01\x00\x00\x00\x18\xd6V\x82KK\x01\x00\x00\x00\x18\xd6V\x83((\x01\x00\x00\x00\x18\xd6V\x84II\x01\x00\x00\x00\x18\xd6V\x85))\x01\x00\x00\x00\x18\xd6V\x86\x90\x90\x01\x00\x00\x00\x18\xd6V\x87oo\x01\x00\x00\x00\x18\xd6V\x88\x04\x04\x01\x00\x00\x00\x18\xd6V\x89\x02\x02\x01\x00\x00\x00\x18\xd6V\x8aqq\x01\x00\x00\x00\x18\xd6V\x8bpp\x01\x00\x00\x00\x18\xd6V\x8cJJ\x01\x00\x00\x00\x18\xd6V\x8d\x01\x01\x01\x00\x00\x00\x18\xd6V\x8eMM\x01\x00\x00\x00\x18\xd6V\x8f&&\x01\x00\x00\x00\x18\xd6V\x90\x01\x01\x01\x00\x00\x00\x18\xd6V\x91\x01\x01\x01\x00\x00\x00\x18\xd6V\x92\x95\x95\t\x00\x00\x00\x18\xd6V\x93MM\x01\x00\x00\x00\x18\xd6V\x94\x97\x97\x01\x00\x00\x00\x18\xd6V\x95\x01\x01\x01\x00\x00\x00\x18\xd6V\x96\x03\x03\x01\x00\x00\x00\x18\xd6V\x97((\x01\x00\x00\x00\x18\xd6V\x98KK\x01\x00\x00\x00\x18\xd6V\x99\x02\x02\x01\x00\x00\x00\x18\xd6V\x9a\x92\x92\x01\x00\x00\x00\x18\xd6V\x9b\x00\x00\x01\x02\x00\x00\x18\xd6V\x9c\x01\x01\x01\x00\x00\x00\x18\xd6V\x9d\'\'\x01\x00\x00\x00\x18\xd6V\x9e\x02\x02\x01\x00\x00\x00\x18\xd6V\x9f\'\'\x01\x00\x00\x00\x18\xd6V\xa0\x02\x02\x01\x00\x00\x00\x18\xd6V\xa1%%\x01\x00\x00\x00\x18\xd6V\xa2\x01\x01\x01\x00\x00\x00\x18\xd6V\xa3\x01\x01\x01\x00\x00\x00\x18\xd6V\xa4\x03\x03\x01\x00\x00\x00\x18\xd6V\xa5MM\x01\x00\x00\x00\x18\xd6V\xa6oo\x01\x00\x00\x00\x18\xd6V\xa7++\x01\x00\x00\x00\x18\xd6V\xa8$$\x02\x00\x00\x00\x18\xd6V\xa9rr\x02\x00\x00\x00\x18\xd6V\xaaKK\x02\x00\x00\x00\x18\xd6V\xaboo\x01\x00\x00\x00\x18\xd6V\xacss\x01\x00\x00\x00\x18\xd6V\xadss\x01\x00\x00\x00\x18\xd6V\xaeKK\x01\x00\x00\x00\x18\xd6V\xafNN\x01\x00\x00\x00\x18\xd6V\xb0KK\x01\x00\x00\x00\x18\xd6V\xb1NN\x01\x00\x00\x00\x18\xd6V\xb2\x04\x04\x01\x00\x00\x00\x18\xd6V\xb3**\x01\x00\x00\x00\x18\xd6V\xb4&&\x01\x00\x00\x00\x18\xd6V\xb5\x00\x00\x00\x00\x00\x00\x18\xd6V\xb6nn\x01\x00\x00\x00\x18\xd6V\xb7\x02\x02\x01\x00\x00\x00\x18\xd6V\xb8tt\x01\x00\x00\x00\x18\xd6V\xb9((\x01\x00\x00\x00\x18\xd6V\xbaMM\x01\x00\x00\x00\x18\xd6V\xbb\x01\x01\x01\x00\x00\x00\x18\xd6V\xbcHH\x01\x00\x00\x00\x18\xd6V\xbd((\x01\x00\x00\x00\x18\xd6V\xbeHH\x01\x00\x00\x00\x18\xd6V\xbf\x00\x00\x01\x00\x00\x00\x18\xd6V\xc0\x01\x01\x01\x00\x00\x00\x18\xd6V\xc1\x01\x01\x01\x00\x00\x00\x18\xd6V\xc2\x00\x00\x01\x00\x00\x00\x18\xd6V\xc3##\x01"\x00\x00\x18\xd6V\xc4\x00\x00\x01\x00\x00\x00\x18\xd6V\xc5\x01\x01\x01\x00\x00\x00\x18\xd6V\xc6\x96\x96\x01\x00\x00\x00\x18\xd6V\xc7\x91\x91\x01\x00\x00\x00\x18\xd6V\xc8ll\x02\x00\x00\x00\x18\xd6V\xc9\x00\x00\x01\x02\x00\x00\x18\xd6V\xca&&\x01\x00\x00\x00\x18\xd6V\xcb&&\x01\x00\x00\x00\x18\xd6V\xccII\x01\x00\x00\x00\x18\xd6V\xcd\x01\x01\x01\x00\x00\x00\x18\xd6V\xce\x02\x02\x01\x00\x00\x00\x18\xd6V\xcf++\x01\x00\x00\x00\x18\xd6V\xd0II\x01\x00\x00\x00\x18\xd6V\xd1$$\x01\x00\x00\x00\x18\xd6V\xd2\x00\x00\x01\x02\x00\x00\x18\xd6V\xd3\x02\x02\x81\x02\x00\x00\x18\xd6V\xd4\x02\x02\x01\x00\x00\x00\x18\xd6V\xd5\x02\x02\x01\x00\x00\x00\x18\xd6V\xd6\'\'\x01\x00\x00\x00\x18\xd6V\xd7\x02\x02\x02\x00\x00\x00\x18\xd6V\xd8\x00\x00\x80\x00\x00\x00\x18\xd6V\xd9\x02\x02\x01\x00\x00\x00\x18\xd6V\xda\x00\x00\x81"\x00\x00\x18\xd6V\xdbtt\x01\x00\x00\x00\x18\xd6V\xdc\'\'\x01\x00\x00\x00\x18\xd6V\xdd\x00\x00\x81\x01\x00\x00\x18\xd6V\xde\x05\x05\x01\x00\x00\x00\x18\xd6V\xdf\'\'\x02\x00\x00\x00\x18\xd6V\xe0LL\x01\x00\x00\x00\x18\xd6V\xe1\x02\x02\x01\x00\x00\x00\x18\xd6V\xe2((\x01\x00\x00\x00\x18\xd6V\xe3\x01\x01\x01\x00\x00\x00\x18\xd6V\xe4\x00\x00\x00\x00\x00\x00\x18\xd6V\xe5\x02\x02\x01\x00\x00\x00\x18\xd6V\xe6\x01\x01\x01\x00\x00\x00\x18\xd6V\xe7\x00\x00\x80\x00\x00\x00\x18\xd6V\xe8\x00\x00\x82\x00\x00\x00\x18\xd6V\xe9\x00\x00\x80\x00\x00\x00\x18\xd6V\xea\x00\x00\x80\x00\x00\x00\x18\xd6V\xeb\x00\x00\x80\x00\x00\x00\x18\xd6V\xec\x00\x00\x81\x00\x00\x00\x18\xd6V\xed\x00\x00\x81\x00\x00\x00\x18\xd6V\xeeHH\x81\x02\x00\x00\x18\xd6V\xef((\x82\x00\x00\x00\x18\xd6V\xf0\x00\x00\x80\x00\x00\x00\x18\xd6V\xf1\x00\x00\x01"\x00\x00'
```

## MQTT Protocol
경량 메시징 프로토콜로서, 제한된 대역폭과 불안정한 네트워크 환경에서도 동작하는 IoT(Internet of Things) 및 M2M(Machine to Machine) 통신에 사용.
 
MQTT는 Publish-Subscribe 모델을 기반으로하며, 메시지 브로커를 중심으로 클라이언트 간에 메시지를 전달

## 데이터 규격 및 분석 방법

queue에서 보내주는 메시지를 header와 body로 분리 후 header는 byte단위로, body는 bit 단위로 해석해야 합니다.

header 규격은 아래와 같습니다.

사진

byte 단위로 1, 1, 1, 2, 4, 4, 8, 4 이므로 unpack의 key는 '>ccBHLLQL’를 사용합니다. 

header: 25byte, body: 25byte 뒤의 데이터

[struct unpack 참고](https://docs.python.org/ko/3/library/struct.html)

body 규격은 아래와 같습니다.

사진

해당하는 크기 만큼의 byte를 bit로 변환 후 하나 하나 분석 해야 합니다.

body 1개의 사이즈: 10, 전체 body를 10으로 나누어 분리 후 리스트에 담아야 함

> 원천에서 보내는 정보가 많아 Message가 분리 되어 올 수 있습니다.
> 
> header의 sequence, current, total을 확인한 후 모든 메시지가 오지 않았으면 별도의 리스트에 담아 끝이 올때까지 기다려야 합니다.

## 파일 구조
signal_config.py - 변수 관련 설정 파일

signal_api_service.py - user 정보를 사용하여 apiToken, otp 정보를 획득하는 서비스

signal_file_service.py - json 파일 핸들링 서비스

signal_json_service.py - json 데이터 가공 서비스

signal_log_service.py - log 서비스

signal_mqtt_service.py - MQTT Protocol을 사용하여 토픽에 Publish 하는 서비스

signal_main_service.py - main 서비스

signal_data_service.py - DB에 적재된 교차로 이동류 정보를 조회하는 서비스

## DB에 교차로 이동류 정보 적재
mapping에 사용할 교차로 이동류와 해당하는 좌표 정보는 실시간에 함께 오지 않습니다. 미리 DB에 적재해둔 뒤 사용해야 합니다.

해당 테이블은 직접 만들어야 하며 1차에서 개발한 데이터를 기준으로 생성하고, 일 단위로 upsert 해줍니다.

과정
1. Ndap(hive)에서 이동류 이력 적재
    - 1차에서 이동류 정보는 hive에 갱신이 아닌 이력성으로 쌓고 있습니다.
    - Airflow를 통해 우리쪽 postgresql에 일 단위로 적재합니다.
2. Greenplum(postgresql)에서 교차로 정보 적재
    - 1차에서 교차로 정보는 postgresql에 매일 갱신되고 있습니다.
    - Airflow를 통해 우리쪽 Postgresql DB에 일 단위로 적재합니다.
3. 두 데이터를 사용하여 DW 생성
    - 위에서 쌓은 두 데이터를 사용하여 중복을 제거한 후 최신 데이터들을 뽑아냅니다.
    <details>
    <summary>초기 적 코드 접기/펼치기</summary>
    
    ```
    INSERT INTO DW_CRSRD_INFO (crsrd_no, plan_div, ring_no, phase_no, flow_no, crsrd_nm, updt_dt, crsrd_type, cntlr_type, lamp_type, main_crsrd_no, sa_grp_no, crsrd_node_id, crsrd_lon, crsrd_lat, ppc_type, flow_start_lon, flow_start_lat, flow_cntr_lon, flow_cntr_lat, flow_end_lon, flow_end_lat)
    select  crsrd_no, plan_div, ring_no, phase_no, flow_no, crsrd_nm, updt_dt, crsrd_type, cntlr_type, lamp_type, main_crsrd_no, sa_grp_no, crsrd_node_id, crsrd_lon, crsrd_lat, ppc_type, flow_start_lon, flow_start_lat, flow_cntr_lon, flow_cntr_lat, flow_end_lon, flow_end_lat
        from (
    WITH CrsrdFlow AS (SELECT t1.id,
                          t1.crsrd_no,
                          t1.plan_div,
                          t1.ring_no,
                          t1.phase_no,
                          t1.updt_dt,
                          t1.flow_no,
                          t1.flow_start_lon,
                          t1.flow_start_lat,
                          t1.flow_cntr_lon,
                          t1.flow_cntr_lat,
                          t1.flow_end_lon,
                          t1.flow_end_lat
                   FROM scs_t_con_intflow_pq t1
                            INNER JOIN (SELECT crsrd_no, MAX(updt_dt) AS max_updt_dt
                                        FROM scs_t_con_intflow_pq
                                        GROUP BY crsrd_no) t2
                                       ON t1.crsrd_no = t2.crsrd_no AND t1.updt_dt = t2.max_updt_dt)
    SELECT rc.crsrd_no,
           cf.updt_dt,
         cf.plan_div,
           cf.ring_no,
           cf.phase_no,
           cf.flow_no,
           rc.crsrd_nm,
           rc.crsrd_type,
           rc.cntlr_type,
           rc.lamp_type,
           rc.main_crsrd_no,
           rc.sa_grp_no,
           rc.crsrd_node_id,
           rc.crsrd_lon,
           rc.crsrd_lat,
           rc.ppc_type,
           cf.flow_start_lon,
           cf.flow_start_lat,
           cf.flow_cntr_lon,
           cf.flow_cntr_lat,
           cf.flow_end_lon,
           cf.flow_end_lat
    FROM scs_t_con_intlc_cur rc
             left join CrsrdFlow cf on rc.crsrd_no = cf.crsrd_no
    where
        plan_div is not null
        and ring_no is not null
        and phase_no is not null
        and flow_no is not null) as e
    ```
    </details>

4. 일 단위 upsert 생성
    - 일 단위로 적재하는 두 테이블의 데이터를 사용하여 upsert 쿼리를 만들고 매일 update, insert를 진행합니다.
    <details>
    <summary>일 단위 적재 코드 접기/펼치기</summary>
    
    ```
    INSERT INTO DW_CRSRD_INFO (CRSRD_NO, UPDT_DT, CRSRD_NM, PLAN_DIV, RING_NO, PHASE_NO, FLOW_NO, CRSRD_TYPE, CNTLR_TYPE, LAMP_TYPE, MAIN_CRSRD_NO, SA_GRP_NO, CRSRD_NODE_ID, CRSRD_LON, CRSRD_LAT, PPC_TYPE, FLOW_START_LON, FLOW_START_LAT, FLOW_CNTR_LON, FLOW_CNTR_LAT, FLOW_END_LON, FLOW_END_LAT)
    SELECT CRSRD_NO, UPDT_DT, CRSRD_NM, PLAN_DIV, RING_NO, PHASE_NO, FLOW_NO, CRSRD_TYPE, CNTLR_TYPE, LAMP_TYPE, MAIN_CRSRD_NO, SA_GRP_NO, CRSRD_NODE_ID, CRSRD_LON, CRSRD_LAT, PPC_TYPE, FLOW_START_LON, FLOW_START_LAT, FLOW_CNTR_LON, FLOW_CNTR_LAT, FLOW_END_LON, FLOW_END_LAT FROM (
        WITH CRSRDFLOW AS (
            SELECT T1.ID,
                   T1.CRSRD_NO,
                   T1.PLAN_DIV,
                   T1.RING_NO,
                   T1.PHASE_NO,
                   T1.UPDT_DT,
                   T1.FLOW_NO,
                   T1.FLOW_START_LON,
                   T1.FLOW_START_LAT,
                   T1.FLOW_CNTR_LON,
                   T1.FLOW_CNTR_LAT,
                   T1.FLOW_END_LON,
                   T1.FLOW_END_LAT
            FROM SCS_T_CON_INTFLOW_PQ T1
            INNER JOIN (
                SELECT CRSRD_NO, MAX(UPDT_DT) AS MAX_UPDT_DT
                FROM SCS_T_CON_INTFLOW_PQ
                WHERE UPDT_DT >= '${fromDate}' AND UPDT_DT < '${toDate}'
                GROUP BY CRSRD_NO)
                T2 ON T1.CRSRD_NO = T2.CRSRD_NO
                AND T1.UPDT_DT = T2.MAX_UPDT_DT
        )
        SELECT RC.CRSRD_NO,
               CF.UPDT_DT,
               RC.CRSRD_NM,
               CF.PLAN_DIV,
               CF.RING_NO,
               CF.PHASE_NO,
               CF.FLOW_NO,
               RC.CRSRD_TYPE,
               RC.CNTLR_TYPE,
               RC.LAMP_TYPE,
               RC.MAIN_CRSRD_NO,
               RC.SA_GRP_NO,
               RC.CRSRD_NODE_ID,
               RC.CRSRD_LON,
               RC.CRSRD_LAT,
               RC.PPC_TYPE,
               CF.FLOW_START_LON,
               CF.FLOW_START_LAT,
               CF.FLOW_CNTR_LON,
               CF.FLOW_CNTR_LAT,
               CF.FLOW_END_LON,
               CF.FLOW_END_LAT
        FROM SCS_T_CON_INTLC_CUR RC
        LEFT JOIN CRSRDFLOW CF ON RC.CRSRD_NO = CF.CRSRD_NO
        WHERE
            PLAN_DIV IS NOT NULL
            AND RING_NO IS NOT NULL
            AND PHASE_NO IS NOT NULL
            AND FLOW_NO IS NOT NULL
    ) AS UPDATE_CRSRD_INFO
    ON CONFLICT (CRSRD_NO, PLAN_DIV, RING_NO, PHASE_NO, FLOW_NO)
    DO UPDATE SET
        CRSRD_NM = EXCLUDED.CRSRD_NM,
        CRSRD_TYPE = EXCLUDED.CRSRD_TYPE,
        CNTLR_TYPE = EXCLUDED.CNTLR_TYPE,
        LAMP_TYPE = EXCLUDED.LAMP_TYPE,
        MAIN_CRSRD_NO = EXCLUDED.MAIN_CRSRD_NO,
        SA_GRP_NO = EXCLUDED.SA_GRP_NO,
        CRSRD_NODE_ID = EXCLUDED.CRSRD_NODE_ID,
        CRSRD_LON = EXCLUDED.CRSRD_LON,
        UPDT_DT = EXCLUDED.UPDT_DT,
        CRSRD_LAT = EXCLUDED.CRSRD_LAT,
        PPC_TYPE = EXCLUDED.PPC_TYPE,
        FLOW_START_LON = EXCLUDED.FLOW_START_LON,
        FLOW_START_LAT = EXCLUDED.FLOW_START_LAT,
        FLOW_CNTR_LON = EXCLUDED.FLOW_CNTR_LON,
        FLOW_CNTR_LAT = EXCLUDED.FLOW_CNTR_LAT,
        FLOW_END_LON = EXCLUDED.FLOW_END_LON,
        FLOW_END_LAT = EXCLUDED.FLOW_END_LAT;
    ```
    </details>

# 흐름도

사진

# 상세
## MQTT Service 실행

[MQTT Service Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/blob/master/rabbitmq/signal_service/signal_mqtt_service.py)

사진

MQTT Publisher 서비스를 실행 합니다.
1. Message Broker 연결
2. RabbitMQ 연결
3. RabbitMQ 메시지 consume
4. 연결된 Message Broker로 가공한 데이터 MQTT Protocol 방식으로 publish

> Message Broker 연결에 실패할 경우가 있습니다.
>
> 재시도 횟수를 정한 뒤 지수 백오프 방식을 사용하여 시간을 점차 늘려가며 재시도 합니다.

## Api를 사용한 apiToken, otp 정보 획득

[Api Service Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/blob/master/rabbitmq/signal_service/signal_api_service.py)

사진

RabbitMQ에 연결하려면 apiToken과 otp 정보가 필요하기에, api를 호출합니다.

1차에 개발되어 있는 MB Server(queue server)에 통신하여 사용할 apiToken과 otp 정보를 획득합니다.

과정
1. evId(userID)와 passwd(Password)를 사용하여 해당 계정의 apiToken을 획득합니다.
2. 획득한 apiToken 정보를 brokerInfo로 요청하여 queue 정보와 otp 정보를 획득합니다.

## psycopg2를 사용한 교차로 이동류 정보 조회

[Data Service Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/blob/master/rabbitmq/signal_service/signal_data_service.py)

사진

신호 데이터를 consume 했을 시 위의 규격을 보면 신호에 대한 자세한 정보는 포함되어 있지 않고, 현시코드에 phase만 있습니다.

적재해둔 이동류 정보와 phase를 mapping 하여 자세한 좌표가 포함된 데이터를 보내주어야 합니다.

> 적재해둔 이동류 정보와 mapping 되는 데이터가 없을 시 값을 보내지 않습니다.

## Message 가공

[Json Service Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/blob/master/rabbitmq/signal_service/signal_json_service.py)

사진

전달받은 메시지는 그대로 사용할 수 없기에 가공하여 전달합니다.

규격에 맞게 header와 body로 분리하고, body부분은 다시 bit 단위로 해석합니다.

과정
1. header와 body 분리
2. header byte 분석 및 sequence, current, total 정보 추출
3. 분석 내용을 바탕으로 데이터 분리 
   - total이 1 일경우 데이터 가공으로 이동 
   - total이 1이 아니며 current와 다를 경우 body 내용을 배열에 저장후 pass
     - 저장 형식 : keep_alive, sequence, binary_msg, current, current_total
   - total이 1이 아니며 current와 동일할 경우 배열에서 동일한 sequence의 body를 조회한 후 하나로 merge
       - 만약 total과 배열에 저장된 값이 다를 경우 해당 sequence에 해당하는 데이터는 제거
   - keep_alive를 두어 consume 30회가 지나도 끝나지 않으면 동일한 sequence 데이터 전부 제거
4. 위의 과정이 정상적으로 넘어올 경우
   - 한 줄로 되어있는 binary data를 규격의 body size(10) 만큼 분리 후 list에 append
   - 배열의 값을 꺼내 bit 단위로 변환 후 데이터 추출
     - crsrd_ no: 교차로 번호
     - plan_div: 시차제 구분
     - a_ring_info - flow_no: a ring flow
     - b_ring_info - flow_no: b ring flow
5. 추출한 데이터를 기반으로 DB의 데이터와 mapping 하여 json 가공
   - crsrd_no = db(crsrd_no)
   - plan_div = db(plan_div)
   - a_ring_flow_no = db(phase_no) => 1 = db(ring_no)
   - b_ring_flow_no = db(phase_no) => 2 = db(ring_no)

> message가 너무 길어 분리되어 올 수 있습니다. header의 current, total을 통해 알아내야 합니다.
> 
> a ring, b ring은 별개입니다. 두 정보를 얻어야 합니다. - a ring info, b ring info
> 
> 하나라도 없으면 보내지 않습니다.

## MQTT Publish

사진

[MQTT Service Code](https://iopgit.mobigen.com/oi-dev-team/gigf_di/-/blob/master/rabbitmq/signal_service/signal_mqtt_service.py)

위의 과정이 끝난 뒤 MQTT Protocol 형태로 전송합니다
