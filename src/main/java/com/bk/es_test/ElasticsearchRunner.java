// package com.bk.es_test;

// import lombok.extern.slf4j.Slf4j;
// import org.elasticsearch.client.RestHighLevelClient;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// import org.springframework.stereotype.Component;

// import java.util.HashMap;
// import java.util.Map;

// /**
//  * @author bkunzh
//  * @date 2022/12/2
//  */
// @Slf4j
// // @Component
// public class ElasticsearchRunner implements ApplicationRunner {

//     @Autowired
//     private RestHighLevelClient restHighLevelClient;
//     private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

//     @Override
//     public void run(ApplicationArguments args) throws Exception {
//         //GetIndexRequest getIndexRequest = new GetIndexRequest(USER_INDEX_NAME);
//         //Boolean exist = restHighLevelClient.indices().exists(getIndexRequest, RequestOptions.DEFAULT);
//         //// 不存在则创建index和setting mapping
//         //if (!exist) {
//         //    log.info("{}索引不存在，开始创建", USER_INDEX_NAME);
//         //    CreateIndexRequest createIndexRequest = new CreateIndexRequest(USER_INDEX_NAME);
//         //    Settings settings = Settings.builder()
//         //            .put("index.number_of_shards", 1)
//         //            .put("index.number_of_replicas", 1)
//         //            .build();
//         //    Map<String, Object> propertyMap = createIndexMapping();
//         //    createIndexRequest.settings(settings).mapping(propertyMap);
//         //
//         //    CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
//         //    if (!createIndexResponse.isAcknowledged()) {
//         //        log.error(">>>> 创建索引和映射关系失败! <<<<");
//         //        throw new RuntimeException("创建索引和映射关系失败");
//         //    }
//         //    log.info("创建索引{}成功", USER_INDEX_NAME);
//         //}
//     }

//     private Map<String, Object> createIndexMapping() {
//         Map<String, Object> resultMap = new HashMap<>();
//         Map<String, Object> fieldsMap = new HashMap<>();
//         UserDocument userDocument = new UserDocument();
//         Map<String, Object> beanMap = new HashMap<>();
//         beanMap.put("id", null);
//         beanMap.put("name", null);
//         beanMap.put("age", null);
//         for (Map.Entry<String, Object> entry : beanMap.entrySet()) {
//             String key = entry.getKey();
//             Map<String, Object> map = new HashMap<>();
//             if ("id".equals(key)) {
//                 Map<String, Object> map2 = new HashMap<>();
//                 map2.put("type", "keyword22");
//                 map2.put("ignore_above", 256);
//                 Map<String, Object> map1 = new HashMap<>();
//                 map1.put("keyword22", map2);
//                 map.put("type", "text");
//                 map.put("fields", map1);
//             } else {
//                 map.put("type", "keyword22");
//                 map.put("store", true);
//             }
//             fieldsMap.put(key, map);
//         }
//         resultMap.put("properties", fieldsMap);
//         return resultMap;
//     }


// }