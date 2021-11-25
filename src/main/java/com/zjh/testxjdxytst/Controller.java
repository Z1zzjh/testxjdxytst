package com.zjh.testxjdxytst;

import com.zjh.testxjdxytst.Dto.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
//    @RequestMapping(value = "/face-web/ws/rest/FaceLibApply/updateFaceRecord", method = RequestMethod.POST)
//    public FaseResponse update(@RequestBody IrdsPersonUpdateDto irdsPersonUpdateDto) {
//        FaseResponse faseResponse = new FaseResponse();
//        faseResponse.setMsg("update success" + irdsPersonUpdateDto.toString());
//        faseResponse.setResultCode(1);
//        return faseResponse;
//    }
//
//    @RequestMapping(value = "/face-web/ws/rest/FaceLibApply/delFaceRecord", method = RequestMethod.DELETE)
//    public FaseResponse delete(@RequestParam(value = "rowKey") String rowKey) {
//        FaseResponse faseResponse = new FaseResponse();
//        faseResponse.setResultCode(1);
//        faseResponse.setMsg("delete success" + rowKey);
//        System.err.println("111111111111111111" + faseResponse.toString());
//        String s = "";
//        return faseResponse;
//    }
//
//    @RequestMapping(value = "/face-web/ws/rest/FaceLibApply/getFaceRecords",method = RequestMethod.GET)
//    public FanchaDto search(@RequestParam(value = "facelibIds") String facelibIds,
//                            @RequestParam(value = "humanCrednum") String humanCrednum,
//                            @RequestParam(value = "pageNum") String pageNum,
//                            @RequestParam(value = "pageSize") String pageSize){
//        System.err.println(facelibIds+"========="+humanCrednum+"========="+pageNum+"======"+pageSize+"---");
//        FanchaDto fanchaDto = new FanchaDto();
//        return fanchaDto;
//    }
//
//    @RequestMapping(value = "/localzhengfawei", method = RequestMethod.POST)
//    public ZfwRespDto zhengfawei(@RequestBody ZfwReqDto zfwReqDto) {
//        ZfwRespDto zfwRespDto = new ZfwRespDto();
//        zfwRespDto.setMessage("hhhhh定制超大傻瓜");
//        zfwRespDto.setStatus(0);
//        zfwRespDto.setTag("");
//        zfwRespDto.setType("1");
//        System.out.println("我又被tmd调用了，操");
//        return zfwRespDto;
//    }
//    @RequestMapping(value = "112233")
//    public String sss(){
//        System.out.println("hellopoooo");
//        return "{\"result\":1,\"jwttoken\":\"eyJ0eXBlIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJ1aWQiOiJxaXVmcyIsIm91Ijoi6aKG5a-854-t5a2QIiwic3BvcmduYW1lcGF0aCI6Ii_kuK3lm73nn7PljJYv5paw55aG55-z5rK5L-euoeeQhuacuuWFsy_pooblr7znj63lrZAvIiwiY24iOiLpgrHlj5Hmo64iLCJhcHBhY2NvdW50IjpbInFpdWZzQEFEX1NFUlZJQ0UiLCJxaXVmc0DmlrDnlobnn7Pmsrnmtbflurfop4bpopHnm5Hmjqfns7vnu58iXSwiYWNjb3VudGlkIjpbInFpdWZzIl0sImVtcGxveWVlbnVtYmVyIjoiMDAwMDE2NDQiLCJzYW1saWRwdG9rZW4iOiJNVEF1TWpRMkxqRTNNeTQ0TnclM0QlM0QlN0NNakJqWTJReE5qTTFOR1ppTjJabVpqazVObVF3TkRreFlUbGxaVGcwTXpJNU16VTRNVGxrWVRGaU9USXlZelJrTXpnNE16YzJZelZpTURabFpEVTVNZyUzRCUzRCU3Q2xaZlk0dHVUd01OdFFOcXElMkJyS2FHd2tCJTJCJTJGTSUzRCIsImlzcyI6IlNJQU0iLCJzdWIiOiJxaXVmcyIsImF1ZCI6IjQyNTYiLCJpYXQiOjE2MTgyMjMxMjEsImV4cCI6MTYxODI1MTkyMSwianRpIjoiODc5NzMyIn0.9WZm2D0ABAbX6SBMR72xa1MmzjZhJvlfu8RHQ4pEBMM\"}";
//    }
//    @RequestMapping(value = "zhsqHsApi/dataResultReport/getHsLxTimeOut")
//    public HealthInfoDto sss1(@RequestBody HealthReqDto healthReqDto){
//        String id = healthReqDto.getId_card();
//        HealthInfoDto healthInfoDto = new HealthInfoDto();
//        if(id.equals("370502199802211614")){
//            healthInfoDto.setResult("1");
//            healthInfoDto.setMsg("成功");
//            healthInfoDto.setCheck_result("1");
//            healthInfoDto.setCheck_result2("1");
//            healthInfoDto.setCheck_time("2021-01-01 12:34:56");
//        }else {
//            healthInfoDto.setResult("1");
//            healthInfoDto.setMsg("成功");
//            healthInfoDto.setCheck_result("1");
//            healthInfoDto.setCheck_result2("1");
//            healthInfoDto.setCheck_time("2021-03-03 12:34:56");
//
//           List list = new ArrayList();
//            AtomicInteger ai = new AtomicInteger();
//            ai.getAndIncrement();
//
//            String s = "{\"Address\":\"新疆岳普湖县艾西曼镇托万科克其村7组013号\",\"Birthday\":\"1989-06-01\",\"BloodType\":\"\",\"CarColor\":\"\",\"CertificateNO\":\"\",\"CustomID\":\"650102003002053\",\"CustomPwd\":\"123456\",\"DetectResult\":\"\",\"DetectScore\":\"\",\"DetectTime\":\"2021-03-06 16:01:32\",\"DetectType\":\"2\",\"DetectTypeName\":\"身份证开门\",\"DevAddress\":\"本部东门人脸2_门1（入）\",\"DevID\":\"f10eaee6aef64a4b82dbb8620610bd58\",\"DevImport\":\"1\",\"DevImportName\":\"进场\",\"DevName\":\"本部东门人脸2_门1（入）\",\"DevType\":\"2\",\"DevUpLoadID\":\"650102003002053\",\"ICNumber\":\"\",\"IDNumber\":\"653128198906010523\",\"IDPlate\":\"\",\"IdentificationNumber\":\"\",\"ImageCard\":\"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\",\"ImageFace\":\"\",\"ImageFullPlate\":\"\",\"ImagePlate\":\"\",\"IsVisitoredIDNumber\":\"\",\"IsVisitoredMainContent\":\"\",\"IsVisitoredMainContentCode\":\"\",\"IsVisitoredName\":\"\",\"Issuer\":\"岳普湖县公安局\",\"LeftEye\":\"\",\"LeftFingure1\":\"\",\"LeftFingure2\":\"\",\"LeftFingure3\":\"\",\"LeftFingure4\":\"\",\"LeftFingure5\":\"\",\"Name\":\"帕提古丽·麦麦提依明\",\"Nation\":\"\",\"NationCode\":\"5\",\"PersonType\":\"3\",\"PlateColor\":\"\",\"PlateDevice\":\"\",\"ResidentialAddress\":\"\",\"RightEye\":\"\",\"RightFingure1\":\"\",\"RightFingure2\":\"\",\"RightFingure3\":\"\",\"RightFingure4\":\"\",\"RightFingure5\":\"\",\"Sex\":\"女\",\"SexCode\":\"2\",\"SignCount\":\"\",\"Telephone\":\"\",\"ValidDateBegin\":\"2015-03-02\",\"ValidDateEnd\":\"2025-03-02\",\"videoCode\":\"\",\"videoName\":\"\"}";
//        }
//        return healthInfoDto;
//    }
//    @RequestMapping(value = "/tas/api/v1/attendanceResults",method = RequestMethod.GET)
//    public String tas(@RequestParam(value = "pageNo") String pageNo,
//                            @RequestParam(value = "pageSize") String pageSize,
//                            @RequestParam(value = "user") String user,
//                            @RequestParam(value = "shiftType") int shiftType,
//        @RequestParam(value = "startDate") String startDate,
//        @RequestParam(value = "endDate") String endDate)
//    {
//        System.err.println(pageNo+"========="+pageSize+"========="+user+"======"+shiftType+"---"+startDate+"======"+endDate);
//        return "{\n" +
//                "    \"code\": \"0\",\n" +
//                "    \"msg\": \"\",\n" +
//                "    \"data\": {\n" +
//                "        \"pageSize\": 3,\n" +
//                "        \"list\": [\n" +
//                "            {\n" +
//                "                \"resultId\": \"9bdd80c7-ed8e-448b-8dbd-5c409cbdf96f\",\n" +
//                "                \"personId\": \"f1e5e630455844199a75e214d711b8d2\",\n" +
//                "                \"personName\": \"苏新\",\n" +
//                "                \"organizationId\": \"304674e6-56a6-407c-ba51-5096f610a765\",\n" +
//                "                \"organizationName\": \"默认组织/物业人员\",\n" +
//                "                \"groupId\": \"56a7736e-6e7a-4322-9cd1-9c386ce56914\",\n" +
//                "                \"groupName\": \"ceshi\",\n" +
//                "                \"shiftId\": \"aa9f003b-5eb9-4e0e-93d3-15cbae53a683\",\n" +
//                "                \"shiftName\": \"教职工普通班时间\",\n" +
//                "                \"onDutyDate\": \"2020-04-25\",\n" +
//                "                \"timePeriodNo\": 2,\n" +
//                "                \"onTime\": \"16:00:00\",\n" +
//                "                \"clockOnTimeISO\": \"\",\n" +
//                "                \"onStatus\": 24,\n" +
//                "                \"onStatusStr\": \"缺勤\",\n" +
//                "                \"onStatusName\": null,\n" +
//                "                \"minuteLate\": null,\n" +
//                "                \"acReaderNameOn\": null,\n" +
//                "                \"doorNameOn\": null,\n" +
//                "                \"controllerNameOn\": null,\n" +
//                "                \"cardNumOn\": null,\n" +
//                "                \"offTime\": \"19:30:00\",\n" +
//                "                \"clockOffTimeISO\": \"\",\n" +
//                "                \"offStatus\": 24,\n" +
//                "                \"offStatusStr\": \"缺勤\",\n" +
//                "                \"offStatusName\": null,\n" +
//                "                \"minuteEarly\": null,\n" +
//                "                \"acReaderNameOff\": null,\n" +
//                "                \"doorNameOff\": null,\n" +
//                "                \"controllerNameOff\": null,\n" +
//                "                \"cardNumOff\": null,\n" +
//                "                \"minLeave\": 0,\n" +
//                "                \"minCompLeave\": 0,\n" +
//                "                \"minOvertime\": 0,\n" +
//                "                \"minAttend\": 0,\n" +
//                "                \"timeAll\": null,\n" +
//                "                \"lessTime\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"resultId\": \"a636e8d8-f7c3-49d0-938f-222981174db3\",\n" +
//                "                \"personId\": \"da571b1d73e740fab2906619bd2b5aa8\",\n" +
//                "                \"personName\": \"史帅\",\n" +
//                "                \"organizationId\": \"304674e6-56a6-407c-ba51-5096f610a765\",\n" +
//                "                \"organizationName\": \"默认组织/物业人员\",\n" +
//                "                \"groupId\": \"56a7736e-6e7a-4322-9cd1-9c386ce56914\",\n" +
//                "                \"groupName\": \"ceshi\",\n" +
//                "                \"shiftId\": \"aa9f003b-5eb9-4e0e-93d3-15cbae53a683\",\n" +
//                "                \"shiftName\": \"教职工普通班时间\",\n" +
//                "                \"onDutyDate\": \"2020-04-25\",\n" +
//                "                \"timePeriodNo\": 2,\n" +
//                "                \"onTime\": \"16:00:00\",\n" +
//                "                \"clockOnTimeISO\": \"\",\n" +
//                "                \"onStatus\": 24,\n" +
//                "                \"onStatusStr\": \"缺勤\",\n" +
//                "                \"onStatusName\": null,\n" +
//                "                \"minuteLate\": null,\n" +
//                "                \"acReaderNameOn\": null,\n" +
//                "                \"doorNameOn\": null,\n" +
//                "                \"controllerNameOn\": null,\n" +
//                "                \"cardNumOn\": null,\n" +
//                "                \"offTime\": \"19:30:00\",\n" +
//                "                \"clockOffTimeISO\": \"\",\n" +
//                "                \"offStatus\": 24,\n" +
//                "                \"offStatusStr\": \"缺勤\",\n" +
//                "                \"offStatusName\": null,\n" +
//                "                \"minuteEarly\": null,\n" +
//                "                \"acReaderNameOff\": null,\n" +
//                "                \"doorNameOff\": null,\n" +
//                "                \"controllerNameOff\": null,\n" +
//                "                \"cardNumOff\": null,\n" +
//                "                \"minLeave\": 0,\n" +
//                "                \"minCompLeave\": 0,\n" +
//                "                \"minOvertime\": 0,\n" +
//                "                \"minAttend\": 0,\n" +
//                "                \"timeAll\": null,\n" +
//                "                \"lessTime\": null\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"resultId\": \"423098ce-b7ba-4450-b951-fd29fbb22878\",\n" +
//                "                \"personId\": \"0fa46ab2504a41aba0099c531b95be22\",\n" +
//                "                \"personName\": \"访客21\",\n" +
//                "                \"organizationId\": \"3e3f08c3-07de-4741-ac01-2a75f71f4356\",\n" +
//                "                \"organizationName\": \"默认组织/访客卡\",\n" +
//                "                \"groupId\": \"56a7736e-6e7a-4322-9cd1-9c386ce56914\",\n" +
//                "                \"groupName\": \"ceshi\",\n" +
//                "                \"shiftId\": \"aa9f003b-5eb9-4e0e-93d3-15cbae53a683\",\n" +
//                "                \"shiftName\": \"教职工普通班时间\",\n" +
//                "                \"onDutyDate\": \"2020-04-25\",\n" +
//                "                \"timePeriodNo\": 1,\n" +
//                "                \"onTime\": \"10:00:00\",\n" +
//                "                \"clockOnTimeISO\": \"\",\n" +
//                "                \"onStatus\": 24,\n" +
//                "                \"onStatusStr\": \"缺勤\",\n" +
//                "                \"onStatusName\": null,\n" +
//                "                \"minuteLate\": null,\n" +
//                "                \"acReaderNameOn\": null,\n" +
//                "                \"doorNameOn\": null,\n" +
//                "                \"controllerNameOn\": null,\n" +
//                "                \"cardNumOn\": null,\n" +
//                "                \"offTime\": \"13:30:00\",\n" +
//                "                \"clockOffTimeISO\": \"\",\n" +
//                "                \"offStatus\": 24,\n" +
//                "                \"offStatusStr\": \"缺勤\",\n" +
//                "                \"offStatusName\": null,\n" +
//                "                \"minuteEarly\": null,\n" +
//                "                \"acReaderNameOff\": null,\n" +
//                "                \"doorNameOff\": null,\n" +
//                "                \"controllerNameOff\": null,\n" +
//                "                \"cardNumOff\": null,\n" +
//                "                \"minLeave\": 0,\n" +
//                "                \"minCompLeave\": 0,\n" +
//                "                \"minOvertime\": 0,\n" +
//                "                \"minAttend\": 0,\n" +
//                "                \"timeAll\": null,\n" +
//                "                \"lessTime\": null\n" +
//                "            }\n" +
//                "        ],\n" +
//                "        \"total\": 276,\n" +
//                "        \"totalPage\": 92,\n" +
//                "        \"pageNo\": 1\n" +
//                "    }\n" +
//                "}";
//    }


    @RequestMapping(value = "ppptest")
    public String ppptest(){
        Hello hello = new Hello();
        hello.setHello("123");
        hello.setHello2(123);
        Map<String,Object> map = new HashMap<>();
        map.put("param","qqq");
        map.put("body",hello);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Ability", "ptz");

        HttpEntity httpEntity = new HttpEntity(map,httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("www.bai",httpEntity,String.class);
        return null;
    }

    @Aopppaaa(methodName="123",queue = "456")
    @RequestMapping(value = "aaaop")
    public String aaaop(){
        return "aaaop";
    }

    ExecutorService executorService = Executors.newFixedThreadPool(5);



    @RequestMapping(value = "task")
    public void asyncTask(){
        List<Future> personList = new ArrayList<>();
        List<Future> classList = new ArrayList<>();
        List<String> personNameList = new ArrayList<>();
        for (int i = 0;i<10;i++){
            Future item = executorService.submit(new MyThreadWithCall());
            personList.add(item);

        }

        for (Future<List<String>> person :personList){
            try {
                while (true){
                    if (person.isDone() && !person.isCancelled()) {
                        List<String> list = person.get();
                        for(String name : list){
                            personNameList.add(name);
                            System.out.println(name);
                        }
                        break;
                    }
                }

            }catch (Exception e){
                System.err.println(e.toString());
            }
        }

        for (int i = 0;i<15;i++){
            executorService.execute(new Thread(new MyThrean(),"hello"));
        }
    }
}
class MyThrean implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class MyThreadWithCall implements Callable{

    @Override
    public Object call() throws Exception {
        List<String> nameList = new ArrayList<>();
        System.out.println("=========执行业务代码，获得返回值=========="+Thread.currentThread().getName());

            Thread.sleep(3000);

            nameList.add("张三");
            nameList.add("李四");
            nameList.add("王五");
            System.out.println("=========睡眠结束=========="+Thread.currentThread().getName());

            return nameList;


    }
}







