//package com.zjh.testxjdxytst.callback;
//
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.StringUtils;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.lang.reflect.Array;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class test {
//    public static void main(String[] args){
//        while (true){
//            int i = 0;
//            int j = 0;
//            int z = 0;
//            String x = null;
//            Scanner scanner = new Scanner(System.in);
//            i = scanner.nextInt();
//            x = scanner.next();
//            j = scanner.nextInt();
//            switch(x){
//                case "+":
//                    z = i+j;
//                    break;
//                case "-":
//                    z=i-j;
//                    break;
//                case "*":
//                    z=j*i;
//                    break;
//                case "/":
//                    z=i/j;
//                    break;
//            }
//            System.out.println(z);
//        }
//    }
//}
//class test2{
//    public static void main(String[] ars){
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            String lll = scanner.nextLine();
//            if(lll.equals("")||lll == null){
//                continue;
//            }
//            int z = getNum(lll);
//
//            System.err.println(z);
//        }
//
//    }
//    public static int getNum(String lll){
//        int z = 0;
//        String[] ss = lll.split("\\s");
//        List list = Arrays.asList(ss);
//        int i = Integer.valueOf((String)list.get(0));
//        String mu = (String)list.get(1);
//        int j = Integer.valueOf((String)list.get(2));
//        switch(mu){
//            case "+":
//                z = i+j;
//                break;
//            case "-":
//                z=i-j;
//                break;
//            case "*":
//                z=j*i;
//                break;
//            case "/":
//                z=i/j;
//                break;
//        }
//        return z;
//    }
//}
//class test3{
//    public static void main(String[] args){
//
//    }
//    public static int getNum(String lll){
//        int z = 0;
//        int i = 0;
//        int j = 0;
//        StringBuilder sb = new StringBuilder();
//        String mu = null;
//        for (int ii = 0;ii<lll.length();ii++){
//            if(Character.isDigit(lll.charAt(i))) {
//                sb.append(lll.charAt(i));
//            }
//        }
//        switch(mu){
//            case "+":
//                z = i+j;
//                break;
//            case "-":
//                z=i-j;
//                break;
//            case "*":
//                z=j*i;
//                break;
//            case "/":
//                z=i/j;
//                break;
//        }
//        return z;
//    }
//}
//class mutP {
//        public static void main(String[] args){
//            Scanner sca = new Scanner(System.in);
//            String x = sca.nextLine();
//            String y = sca.nextLine();
//            System.out.println(f(x,y));
//        }
//
//        //分治法
//        public static Long f(String x,String y){
//            String a = x.substring(0, x.length()/2);
//            String b = x.substring(x.length()/2);
//            String c = y.substring(0, y.length()/2);
//            String d = y.substring(y.length()/2);
//            int n = b.length();
//            int m = d.length();
//            if(x.length()<=4 && y.length()<=4){
//                return (long) (Integer.parseInt(x)*Integer.parseInt(y));
//            }
//            if(x.length()>4 && y.length()<=4){
//                return (long) (f(a,y)*Math.pow(10, n)+f(b,y));
//            }
//            if(y.length()>4 && x.length()<=4){
//                return (long) (f(c,x)*Math.pow(10, m)+f(d,x));
//            }else{
//                return (long) (f(a,c)*Math.pow(10, n+m)+f(a,d)*Math.pow(10, n)+f(b,c)*Math.pow(10, m)+f(b,d));
//            }
//    }
//}
//class fenzhi{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String num1 = scanner.nextLine();
//        String num2 = scanner.nextLine();
//        System.err.println(chengfa(num1,num2));
//    }
//    public static long chengfa(String num1,String num2){
//        String a = num1.substring(0,num1.length()/2);
//        String b = num1.substring(num1.length()/2);
//        String c = num2.substring(0,num2.length()/2);
//        String d = num2.substring(num2.length()/2);
//        int n = b.length();
//        int m = d.length();
//        if(num1.length()<=4 && num2.length()<=4){
//            return (Integer.parseInt(num1)*Integer.parseInt(num2));
//        }if(num1.length()>4&&num2.length()<=4){
//            return (long)(chengfa(num2,a)*Math.pow(10,n)+chengfa(num2,b));
//        }if(num1.length()<=4&&num2.length()>4){
//            return (long)(chengfa(num1,c)*Math.pow(10,m)+chengfa(num1,d));
//        }else
//            return (long)(chengfa(a,c)*Math.pow(10,n+m)+chengfa(a,d)*Math.pow(10,n)+chengfa(b,c)*Math.pow(10,m)+chengfa(b,d));
//    }
//    String s = " ddd ";
//    String ss = s.trim();
//
//}
//class taet{
//    public static void main(String[] args){
//        String s = " ddd =   ";
//        String ss = s.trim();
//        StringBuilder stringBuilder = new StringBuilder("hellooo");
//        char[] c = new char[]{'f','d','s'};
//        Arrays.fill(c,'e');
//        stringBuilder.insert(2,c,1,2);
//        System.err.println(stringBuilder);
//    }
//}
//class TestLinkList{
//    public static void main(String[] args){
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.push(1);
//        linkedList.push(4);
//        linkedList.push(6);
//        System.out.println(linkedList.toString());
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.pop());
//        System.out.println(linkedList.pop());
//    }
//}
//
//class TestTree{
//    LinkedList<String> linkedList = new LinkedList<>();
//    public static void main(String[] args){
//        Node node1 = new Node("我是1");
//        Node node2 = new Node("我是2");
//        Node node3 = new Node("我是3");
//        node1.setLeft(node2);
//        node1.setRight(node3);
//        LinkedList<String> linkedList = preprder(node1);
//        while (!CollectionUtils.isEmpty(linkedList)){
//            System.err.println(linkedList.poll());
//        }
//        new Thread(()->sayhello()).start();
//
//    }
//    public static void sayhello(){
//        int i = 10;
//        while (i>0){
//            System.err.println("我是废物");
//            i--;
//        }
//
//    }
//    static LinkedList<String> linkedLists = new LinkedList<>();
//    public static LinkedList preprder(Node node){
//
//        if(node!=null){
//            String s = node.getValue();
//            linkedLists.add(s);
//            preprder(node.getLeft());
//            preprder(node.getRight());
//        }
//
////        System.out.println(linkedList.toString());
//        return linkedLists;
//    }
//
//
//}
//class Node{
//    public  Node(String s){
//        this.value = s;
//    }
//    private String value;
//    private Node left;
//    private Node Right;
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public Node getLeft() {
//        return left;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public Node getRight() {
//        return Right;
//    }
//
//    public void setRight(Node right) {
//        Right = right;
//    }
//}
//
//class nn{
//    public static void main(String[] args) throws InterruptedException {
//        Thrrreaf thrrreaf = new Thrrreaf();
//        Thread t = new Thread(thrrreaf,"线程1");
//        t.start();
//        t.interrupt();
//    }
//}
//
//class Thrrreaf implements Runnable{
//    @Override
//    public void run() {
//        try {
//            System.out.println("2222222222"+Thread.currentThread().isInterrupted());
//            System.out.println("睡"+Thread.currentThread().getName());
////            Thread.sleep(2000);
//            System.out.println("醒了"+Thread.currentThread().getName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class pperson implements Serializable {
//    private String name;
//    private Integer age;
//    public pperson(String name,Integer age){
//        this.name = name;
//        this.age = age;
//    }
//    String s = "{\"facelibId\":1,\"humanId\":\"788c805a-dc10-4d96-96af-c33440cbd2a2\",\"externalId\":\"133\",\"humanName\":\"zjx\",\"humanAge\":25,\"birthDate\":\"1970-01-01\",\"createDate\":\"2016-01-01\",\"humanMale\":1,\"humanProvince\":\"fms.xzqy.100000.330000\",\"humanCity\":\"fms.xzqy.100000.330000.330100\",\"humanNation\":\"0\",\"humanCredtype\":0,\"humanCrednum\":\"3390518383883\"}";
//    @Override
//    public String toString() {
//        return "pperson{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//class OutWrite{
//    public static void main(String[] args){
//
//        String url = "C:/Users/zhujianhong/Documents/我接收到的文件/encapsulate-tool_1.4.9.20191115112700/workspace/qq.txt";
//        try (//创建一个ObjectOutputStream输出流
//             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url))) {
//            //将对象序列化到文件s
//            pperson person = new pperson("9龙", 23);
//            oos.writeObject(person);
//            Map map = new HashMap();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class tt{
//    public static void main(String[] args){
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddhhmmss");
//        try {
//            System.out.println(dateFormat.format(date));
//            String s111 = dateFormat.format(date);
//
//            Date date3 = dateFormat.parse(s111);
//            String s3 = dateFormat2.format(date3);
//            System.out.println(s3);
//            Long long1 = Long.parseLong(s3);
//            long long2 = long1-1;
//            System.out.println(long2);
//            System.out.println("===============");
//            Date date2 = dateFormat2.parse(s111);
//            String s2 = dateFormat2.format(date2);
//            System.out.println(s2);
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
//
//
//    }
//}
//class cha{
//    public static void main(String[] args){
//        LinkedList linkedList = new LinkedList();
//        List<String> l2 = new ArrayList<>();
//        Set set = new HashSet();
//
//        l2.contains("123");
//        Stack stack = new Stack();
//        int[] nums = new int[10];
//        Arrays.sort(nums);
//        char ch = 'c';
//       int x = ch-'a';
//       System.out.println(x);
//    }
//}
//
//class Solution {
//    public static void main(String[] args){
//        int[] num1 = {5,9,18,54,108,540,90,180,360,720};
//        List<Integer> list = largestDivisibleSubset(num1);
//        System.out.println(list.toString());
//    }
//
//    public static List<Integer> largestDivisibleSubset(int[] nums) {
//        Arrays.sort(nums);
//        List list1 = new ArrayList();
//        for(int x = 0;x<nums.length;x++){
//            int[] num1 = Arrays.copyOfRange(nums,x,nums.length);
//            List<Integer> list = largestDivisibleSubset1(num1);
//            if(list.size()>list1.size()){
//                list1 = list;
//            }
//        }
//        return list1;
//    }
//
//    public static List<Integer> largestDivisibleSubset1(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        List<Integer> removList = new ArrayList<>();
//        if(nums.length == 1){
//            List<Integer> list =  new ArrayList<>();
//            list.add(nums[0]);
//            return  list;
//        }
//        else {
//            for(int i = 0;i<nums.length;i++){
//                if(!removList.contains(nums[i])){
//                    for(int j = i+1;j<nums.length;j++) {
////                if(!removList.contains(nums[j])){
//                        if (nums[j] % nums[i] == 0) {
//                            set.add(nums[i]);
//                            set.add(nums[j]);
//                        } else {
//                            set.add(nums[i]);
//                            removList.add(nums[j]);
//                            if (set.contains(nums[j])) {
//                                set.remove(nums[j]);
//                            }
//                        }
//                    }
//                }
//            }
//            List<Integer> list =  new ArrayList<>(set);
//            return list;
//        }
//    }
//}
//class Solution2 {
//    Map<Integer, Integer> map = new HashMap<>();
//    // int[][] cache = new int[2009][2009];
//    Map<String, Boolean> cache = new HashMap<>();
//    public boolean canCross(int[] ss) {
//        int n = ss.length;
//        for (int i = 0; i < n; i++) {
//            map.put(ss[i], i);
//        }
//        // check first step
//        if (!map.containsKey(1)) return false;
//        return dfs(ss, ss.length, 1, 1);
//    }
//    boolean dfs(int[] ss, int n, int u, int k) {
//        String key = u + "_" + k;
//        // if (cache[u][k] != 0) return cache[u][k] == 1;
//        if (cache.containsKey(key)) return cache.get(key);
//        if (u == n - 1) return true;
//        for (int i = -1; i <= 1; i++) {
//            if (k + i == 0) continue;
//            int next = ss[u] + k + i;
//            if (map.containsKey(next)) {
//                boolean cur = dfs(ss, n, map.get(next), k + i);
//                // cache[u][k] = cur ? 1 : -1;
//                cache.put(key, cur);
//                if (cur) return true;
//            }
//        }
//        // cache[u][k] = -1;
//        cache.put(key, false);
//        return false;
//    }
//}
//class cha1{
//    public static void main(String[] args){
//        Solution1 solution1 = new Solution1();
//        int[] ints = {0,1,3,5,6,8,12,17};
//        Boolean b = solution1.canCross(ints);
//    }
//}
//class Solution1 {
//    Map<Integer, Integer> map = new HashMap<>();
//    public boolean canCross(int[] ss) {
//        int n = ss.length;
//        // 将石子信息存入哈希表
//        // 为了快速判断是否存在某块石子，以及快速查找某块石子所在下标
//        for (int i = 0; i < n; i++) {
//            map.put(ss[i], i);
//        }
//        // check first step
//        // 根据题意，第一步是固定经过步长 1 到达第一块石子（下标为 1）
//        if (!map.containsKey(1)) return false;
//        return dfs(ss, ss.length, 1, 1);
//    }
//
//    /**
//     * 判定是否能够跳到最后一块石子
//     * @param ss 石子列表【不变】
//     * @param n  石子列表长度【不变】
//     * @param u  当前所在的石子的下标
//     * @param k  上一次是经过多少步跳到当前位置的
//     * @return 是否能跳到最后一块石子
//     */
//    boolean dfs(int[] ss, int n, int u, int k) {
//        if (u == n - 1) return true;
//        for (int i = -1; i <= 1; i++) {
//            // 如果是原地踏步的话，直接跳过
//            if (k + i == 0) continue;
//            // 下一步的石子理论编号
//            int next = ss[u] + k + i;
//            // 如果存在下一步的石子，则跳转到下一步石子，并 DFS 下去
//            if (map.containsKey(next)) {
//                boolean cur = dfs(ss, n, map.get(next), k + i);
//                if (cur) return true;
//            }
//        }
//        return false;
//    }
//}
//
//
//class testhash{
//    public static void main(String[] args) {
//        String s = "qweqeqe";
//        String[] ss = s.split("_");
//        String p = ss[ss.length-1];
//        System.out.println(p);
//    }
//}
//
//class MeanOfThis{
//    public final int value = 4;
//    public void doIt(){
//        int value = 6;
//        Runnable r = new Runnable() {
//            public final int value = 5;
//            @Override
//            public void run() {
//                int value = 10;
//                System.out.println(this.value);
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        r.run();
//    }
//    public static void main(String[] args){
//        MeanOfThis meanOfThis = new MeanOfThis();
//        meanOfThis.doIt();
//    }
//}