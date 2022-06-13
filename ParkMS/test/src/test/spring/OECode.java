//package spring;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import spring.net.mydream.entity.*;
//import spring.net.mydream.service.*;
//import spring.net.mydream.utils.PreconditionException;
//
//import java.util.List;
//
//
//@SpringBootTest
//public class OECode {
////  @MockBean
////  @SpyBean
//    @Autowired
//    private DictionaryDataService dictionaryDataService;
//    @Autowired
//    private  MenuService menuService;
//    @Autowired
//    private  UserService userService;
//    @Autowired
//    private  UserTwoService userTwoService;
//
//    @Autowired
//    private  EasyWebSystem easyWebSystem;
//    @Test
//    void saveCM()  {
//        //创建用户
//        //---------------------------------------------------
//        List<DictionaryData> a1 = null;
//        try {
////            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
//            a1 = dictionaryDataService.listByDictCodeAndName("dictCode1","Name1");
//
//        } catch (PreconditionException e) {
//            a1 = null ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNotNull(a1);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void saveCM2()  {
//        //---------------------------------------------------
//        List<DictionaryData> a1 = null;
//        try {
//
//            a1 = dictionaryDataService.listByDictCodeAndName("dictCode2","Name2");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void listByDictCode()  {
//        //---------------------------------------------------
//        List<DictionaryData> a1;
//        try {
//
//            a1 = dictionaryDataService.listByDictCode("dictCode1");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void listByDictCode2()  {
//        //---------------------------------------------------
//        List<DictionaryData> a1 = null;
//        try {
//
//            a1 = dictionaryDataService.listByDictCode("dictCode2");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getUserMenu()  {
//        //---------------------------------------------------
//        List<Menu> a1 = null;
//        try {
//
//            a1 = menuService.getUserMenu(1,1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getUserMenu2()  {
//        //---------------------------------------------------
//        List<Menu> a1 = null;
//        try {
//
//            a1 = menuService.getUserMenu(1,2);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getFullById()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.getFullById(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getFullById2()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.getFullById(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void selectRoleAndAuth()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.selectRoleAndAuth(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void selectRoleAndAuth2()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.selectRoleAndAuth(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getRoleIds()  {
//        //---------------------------------------------------
//        List<Integer> a1 = null;
//        try {
//
//            a1 = userService.getRoleIds(1);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getRoleIds2()  {
//        //---------------------------------------------------
//        List<Integer> a1 = null;
//        try {
//
//            a1 = userService.getRoleIds(100);
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getByUsername()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.getByUsername("zhc");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getByUsername2()  {
//        //---------------------------------------------------
//        User a1 = null;
//        try {
//
//            a1 = userService.getByUsername("zhczhc");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//    @Test
//    void freezeA()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userService.freezeA(1,2);
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void freezeA2()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userService.freezeA(1,1);
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void resetPsw()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userService.resetPsw(1,"123456","123");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void resetPsw2()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userService.resetPsw(1,"123","123");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void comparePsw()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userTwoService.comparePsw("123","123");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void comparePsw2()  {
//        //---------------------------------------------------
//        Boolean a1 = false;
//        try {
//
//            a1 = userTwoService.comparePsw("123","12345");
//        } catch (Exception e) {
////            e.printStackTrace();
////            a1 = null ;
//            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//    @Test
//    void getByUserTwoname()  {
//        //---------------------------------------------------
//        UserTwo a1 = null;
//        try {
//
//            a1 = userTwoService.getByUserTwoname("zhc");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
////        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//    @Test
//    void getByUserTwoname2()  {
//        //---------------------------------------------------
//        UserTwo a1 = null;
//        try {
//
//            a1 = userTwoService.getByUserTwoname("zhc123");
//        } catch (Exception e) {
////            e.printStackTrace();
//            a1 = null ;
////            a1 = false ;
//        }
////        if(a1==null || a1.size()==0){
////            a1 = null ;
////        }
//        Assertions.assertNull(a1);
////        Assertions.assertNotNull(a1);
////        Assertions.assertEquals(true,a1);
////        Assertions.assertEquals(false,a1);
//        //---------------------------------------------------
//    }
//
//
//
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createDictionary()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createDictionary(1,"1000","字典1");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createDictionary2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createDictionary(1,"1000","字典1");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryDictionary()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Dictionary a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryDictionary(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryDictionary2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Dictionary a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryDictionary(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyDictionary()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyDictionary(100,"100","字典2");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyDictionary2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyDictionary(1,"100","字典2");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteDictionary()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteDictionary(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteDictionary2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteDictionary(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createDictionaryData()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createDictionaryData(1,"1000","字典1");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createDictionaryData2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createDictionaryData(1,"1000","字典1");
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryDictionaryData()  {
//
//        //创建用户
//        //---------------------------------------------------
//        DictionaryData a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryDictionaryData(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryDictionaryData2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        DictionaryData a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryDictionaryData(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyDictionaryData()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyDictionaryData(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyDictionaryData2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyDictionaryData(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteDictionaryData()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteDictionaryData(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteDictionaryData2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteDictionaryData(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createLoginRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createLoginRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createLoginRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createLoginRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryLoginRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        LoginRecord a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryLoginRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryLoginRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        LoginRecord a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryLoginRecord(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyLoginRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyLoginRecord(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyLoginRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyLoginRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteLoginRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteLoginRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteLoginRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteLoginRecord(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createMenu()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createMenu(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createMenu2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createMenu(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryMenu()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Menu a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryMenu(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryMenu2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Menu a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryMenu(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyMenu()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyMenu(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyMenu2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyMenu(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteMenu()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteMenu(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteMenu2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteMenu(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createOperRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createOperRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createOperRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createOperRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryOperRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        OperRecord a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryOperRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryOperRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        OperRecord a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryOperRecord(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyOperRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyOperRecord(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyOperRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyOperRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteOperRecord()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteOperRecord(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteOperRecord2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteOperRecord(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createOrganization()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createOrganization(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createOrganization2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createOrganization(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryOrganization()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Organization a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryOrganization(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryOrganization2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Organization a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryOrganization(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyOrganization()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyOrganization(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyOrganization2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyOrganization(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteOrganization()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteOrganization(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteOrganization2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteOrganization(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createUser()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createUser2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryUser()  {
//
//        //创建用户
//        //---------------------------------------------------
//        User a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryUser2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        User a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryUser(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyUser()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyUser(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyUser2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteUser()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteUser2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteUser(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createRole()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createRole(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createRole2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createRole(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryRole()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Role a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryRole(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryRole2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Role a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryRole(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyRole()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyRole(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyRole2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyRole(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteRole()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteUser(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteRole2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteRole(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//
//    //-----------------------------------------------------------
//
//    @Test
//    void createUserTwo()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.createUserTwo(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void createUserTwo2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            //已创建id为1的User对象
//            a2 = easyWebSystem.createUserTwo(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void queryUserTwo()  {
//
//        //创建用户
//        //---------------------------------------------------
//        UserTwo a2 = null;
//        try {
////            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
//            a2 = easyWebSystem.queryUserTwo(1);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNotNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//    @Test
//    void queryUserTwo2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        UserTwo a2 = null;
//        try {
////            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
//            a2 = easyWebSystem.queryUserTwo(1000);
//
//        } catch (PreconditionException e) {
//            a2 = null ;
//        }
//        Assertions.assertNull(a2);
//        //---------------------------------------------------
//
//    }
//
//
//
//    @Test
//    void modifyUserTwo()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyUserTwo(100);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void modifyUserTwo2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.modifyUserTwo(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//
//    @Test
//    void deleteUserTwo()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteUserTwo(1);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(true,a2);
//        //---------------------------------------------------
//
//    }
//    @Test
//    void deleteUserTwo2()  {
//
//        //创建用户
//        //---------------------------------------------------
//        Boolean a2 = null;
//        try {
////            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
//            a2 = easyWebSystem.deleteUserTwo(10);
//
//        } catch (PreconditionException e) {
//            a2 = false ;
//        }
//        Assertions.assertEquals(false,a2);
//        //---------------------------------------------------
//
//    }
//
//}
