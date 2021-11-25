package com.zjh.testxjdxytst;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zjh.testxjdxytst.Dto.SearchDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JsonStringToJavaBean {
    @RequestMapping(value = "JsonString")
    public void JsonStringToJavaBean(){
        String ss = "{\"msg\":\"操作成功\",\n" +
                "\"resultCode\":0,\n" +
                "\"jsonData\":{\n" +
                "\"data\":[{\n" +
                "\"birth_date\":\"1999-01-01\",          \n" +
                "\"bkg_picurl\":\"http://192.1.1.1/test/bkg_picurl\",  \n" +
                "\"create_date\":\"2016-12-30\",                \n" +
                "\"face_picurl\":\"http://192.1.1.1/face_picurl/face_picurl\", \n" +
                "\"facelib_id\":\"1\",                      \n" +
                "\"human_age\":17,                      \n" +
                "\"human_city\":\"1\",                     \n" +
                "\"human_crednum\":\"\",                  \n" +
                "\"human_credtype\":1,                  \n" +
                "\"human_male\":1,                     \n" +
                "\"human_name\":\"李四\",                \n" +
                "\"human_province\":\"1\",              \n" +
                "\"human_nation\":\"0\",                  \n" +
                "\"rowKey\":\"0094_9_48ef0f5c6f6140839df4ea7bf84b8708\", \n" +
                "\"detect_quality\":1,                    \n" +
                "\"points_quality\":0.9792739748954773,   \n" +
                "\"eye_distance\":41.0483512878418,     \n" +
                "\"colorful\":1.0,                        \n" +
                "\"gray_scale\":0,                      \n" +
                "\"gray_mean\":-1.0,                     \n" +
                "\"gray_var\":-1.0,                    \n" +
                "\"clearity\":0.0,                       \n" +
                "\"pose_pitch\":15.26115608215332,    \n" +
                "\"pose_yaw\":2.063262939453125,       \n" +
                "\"pose_roll\":-1.0,                     \n" +
                "\"pose_conf\":-1.0,                     \n" +
                "\"frontal\":-1.0,                       \n" +
                "\"uncovered\":-1.0,                     \n" +
                "\"total_quality\":-1.0,                 \n" +
                "\"certificate\":1,              \n" +
                "\"case_code\":\"caseCode\",               \n" +
                "\"manage_police\":\"managePolice\",        \n" +
                "\"police_phone\":\"policePhone\",          \n" +
                "\"native_county_code\":\"nativeCountyCode\",\n" +
                "                                   \n" +
                "\"residence_county_code\":\"residenceCountyCode\",\n" +
                "                                  \n" +
                "\"res_num1\":1,                       \n" +
                "\"res_num2\":2,\n" +
                "\"error_code\":0,                      \n" +
                "\"res_str3\":\"resStr3\",\n" +
                "\"res_str4\":\"resStr4\",\n" +
                "\"res_str5\":\"resStr5\",\n" +
                "\"res_str6\":\"resStr6\",\n" +
                "\"res_str7\":\"resStr7\",\n" +
                "\"res_str8\":\"resStr8\",\n" +
                "\"res_str9\":\"resStr9\",\n" +
                "\"res_str10\":\"resStr10\",\n" +
                "\"passthrough_field\":\"passthroughField\",   \n" +
                "\"face_iqa\":\"{\\\"clearity\\\":0.9610262,\\\"uncovered\\\":0.8885743,\\\"grayScale\\\":71,\\\"colorful\\\":0.7758286,\\\"detectQuality\\\":0,\\\"posePitch\\\":0.0,\\\"pointsQuality\\\":0.70183647,\\\"poseYaw\\\":31.665543,\\\"totalQuality\\\":0.64306104,\\\"frontal\\\":0.6253441,\\\"eyeDistance\\\":0.83420575,\\\"poseConf\\\":0.16207051,\\\"grayMean\\\":91.3153,\\\"grayVar\\\":149.49464,\\\"poseRoll\\\":41.399887}\"\n" +
                "                                  \n" +
                "      },{\n" +
                "\"birth_date\":\"1999-01-01\",\n" +
                "\"bkg_picurl\":\"http://192.1.1.1/test/bkg_picurl2\",\n" +
                "\"create_date\":\"2016-12-30\",\n" +
                "\"face_picurl\":\"http://192.1.1.1/face_picurl/face_picurl2\",\n" +
                "\"facelib_id\": \"1\",\n" +
                "\"human_age\":17,\n" +
                "\"human_city\":\"\",\n" +
                "\"human_crednum\":\"\",\n" +
                "\"human_credtype\":0,\n" +
                "\"human_male\":1,\n" +
                "\"human_name\":\"张三\",\n" +
                "\"human_province\":\"\",\n" +
                "\"rowKey\":\"0094_9_48ef0f5c5hyu140839df4ea7bf84b8708\",\n" +
                "\"detect_quality\":1,                    \n" +
                "\"points_quality\":0.9792739748954773,    \n" +
                "\"eye_distance\":41.0483512878418,     \n" +
                "\"colorful\":1.0,                       \n" +
                "\"gray_scale\":0,                     \n" +
                "\"gray_mean\":-1.0,                    \n" +
                "\"gray_var\":-1.0,                   \n" +
                "\"clearity\":0.0,                    \n" +
                "\"pose_pitch\":15.26115608215332,     \n" +
                "\"pose_yaw\":2.063262939453125,       \n" +
                "\"pose_roll\":-1.0,                      \n" +
                "\"pose_conf\":-1.0,                     \n" +
                "\"frontal\":-1.0,                       \n" +
                "\"uncovered\":-1.0,                     \n" +
                "\"total_quality\":-1.0,                  \n" +
                "\"face_iqa\":\"{\\\"clearity\\\":0.9610262,\\\"uncovered\\\":0.8885743,\\\"grayScale\\\":71,\\\"colorful\\\":0.7758286,\\\"detectQuality\\\":0,\\\"posePitch\\\":0.0,\\\"pointsQuality\\\":0.70183647,\\\"poseYaw\\\":31.665543,\\\"totalQuality\\\":0.64306104,\\\"frontal\\\":0.6253441,\\\"eyeDistance\\\":0.83420575,\\\"poseConf\\\":0.16207051,\\\"grayMean\\\":91.3153,\\\"grayVar\\\":149.49464,\\\"poseRoll\\\":41.399887}\",\n" +
                "                                   \n" +
                "\"certificate\":2,               \n" +
                "\"case_code\":\"caseCode\",               \n" +
                "\"manage_police\":\"managePolice\",      \n" +
                "\"police_phone\":\"policePhone\",          \n" +
                "\"native_county_code\":\"nativeCountyCode\",\n" +
                "                                   \n" +
                "\"residence_county_code\":\"residenceCountyCode\",\n" +
                "                                   \n" +
                "\"res_num1\":1,                        \n" +
                "\"res_num2\":2,\n" +
                "\"error_code\":0,                     \n" +
                "\"res_str3\":\"resStr3\",\n" +
                "\"res_str4\":\"resStr4\",\n" +
                "\"res_str5\":\"resStr5\",\n" +
                "\"res_str6\":\"resStr6\",\n" +
                "\"res_str7\":\"resStr7\",\n" +
                "\"res_str8\":\"resStr8\",\n" +
                "\"res_str9\":\"resStr9\",\n" +
                "\"res_str10\":\"resStr10\",\n" +
                "\"passthrough_field\":\"passthroughField\"    \n" +
                "\n" +
                "}],\n" +
                "\"totalNum\":6                  \n" +
                "}\n" +
                "}";

        //根据personID反查rowKey
        SearchDto searchDto = JSONObject.parseObject(ss,SearchDto.class);
        Object o = searchDto.getJsonData().getData().get(0);
        Map map = JSONObject.parseObject(JSONObject.toJSONString(o),Map.class);
        String sssss = (String) map.get("rowKey");




    }
}




