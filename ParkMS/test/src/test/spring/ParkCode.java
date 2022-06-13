package spring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spring.net.mydream.entity.*;
import spring.net.mydream.service.*;
import spring.net.mydream.utils.PreconditionException;

import java.util.List;


@SpringBootTest
public class ParkCode {
//  @MockBean
//  @SpyBean
    @Autowired
    private CarManageService carManageService;
    @Autowired
    private CarParkingRecordService carParkingRecordService;
    @Autowired
    private FinanceManageService financeManageService;
    @Autowired
    private MenueService menueService;


    @Autowired
    private ParkManageService parkManageService;
    @Autowired
    private PayManageService payManageService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserManageService userManageService;
    @Autowired
    private ParkSystem parkSystem;
    @Test
    void saveCM()  {
        //创建用户
        //---------------------------------------------------
        Boolean a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.saveCM("停车场是用来停车的","停车场",1,1);

        } catch (PreconditionException e) {
            a1 = false ;
        }
        Assertions.assertEquals(true,a1);
        //---------------------------------------------------

    }
    @Test
    void saveCM2()  {
        //创建用户
        //---------------------------------------------------
        Boolean a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.saveCM("停车场是用来停车的",null,1,1);

        } catch (PreconditionException e) {
            a1 = false ;
        }
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------

    }


    @Test
    void listCM()  {
        //创建用户
        //---------------------------------------------------
        List<CarManage> a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.listCM("停车",1,1);

        } catch (PreconditionException e) {
            a1 = null ;
//            a1 = false ;
        }
        if(a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        //---------------------------------------------------

    }
    @Test
    void listCM2()  {
        //---------------------------------------------------
        List<CarManage> a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.listCM("停车T",2,1);
        } catch (PreconditionException e) {
            a1 = null ;
//            a1 = false ;
        }
        if(a1.size()==0){
            a1 = null ;
        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }


    @Test
    void renewCM()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.renewCM(1,1,1);
        } catch (PreconditionException e) {
//            a1 = null ;
            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void renewCM2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.renewCM(1,1,100);
        } catch (PreconditionException e) {
//            a1 = null ;
            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByPlateNumberCM()  {
        //---------------------------------------------------
        CarManage a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.getByPlateNumberCM("1",1);
        } catch (PreconditionException e) {
            a1 = null ;
//            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByPlateNumberCM2()  {
        //---------------------------------------------------
        CarManage a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = carManageService.getByPlateNumberCM("1",100);
        } catch (PreconditionException e) {
            a1 = null ;
//            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void carParkingRecordService()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {
            CarParkingRecord entity = new CarParkingRecord();
            entity.setOrgId(1);
            entity.setParkManageId(1);
            entity.setType(1);
            a1 = carParkingRecordService.saveCR(entity);
        } catch (PreconditionException e) {
//            a1 = null ;
            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void carParkingRecordService2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = carParkingRecordService.saveCR(null);
        } catch (Exception e) {
//            a1 = null ;
            a1 = false ;
        }
//        if(a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listCR()  {
        //---------------------------------------------------
        List<CarParkingRecord> a1 = null;
        try {

            a1 = carParkingRecordService.listCR(1,1);
        } catch (Exception e) {
            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listCR2()  {
        //---------------------------------------------------
        List<CarParkingRecord> a1 = null;
        try {

            a1 = carParkingRecordService.listCR(1,100);
        } catch (Exception e) {
            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void getByPlateNumberCR()  {
        //---------------------------------------------------
        CarManage a1 = null;
        try {

            a1 = carParkingRecordService.getByPlateNumberCR("1",1);
        } catch (Exception e) {
            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByPlateNumberCR2()  {
        //---------------------------------------------------
        CarManage a1 = null;
        try {

            a1 = carParkingRecordService.getByPlateNumberCR("1",100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }


    @Test
    void listOM()  {
        //---------------------------------------------------
        List<Order_S> a1 = null;
        try {

            a1 = financeManageService.listOM();
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void saveOM()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = financeManageService.saveOM(100);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void saveOM2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = financeManageService.saveOM(1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByUser()  {
        //---------------------------------------------------
        SysUser a1 = null;
        try {

            a1 = menueService.getByUser("zhc");
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByUser2()  {
        //---------------------------------------------------
        SysUser a1 = null;
        try {

            a1 = menueService.getByUser("zsh");
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void drop()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = menueService.drop(1,1,1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void drop2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = menueService.drop(100,1,1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void selectPM()  {
        //---------------------------------------------------
        CarParkManage a1 = null;
        try {

            a1 = parkManageService.selectPM(1,1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void selectPM2()  {
        //---------------------------------------------------
        CarParkManage a1 = null;
        try {

            a1 = parkManageService.selectPM(1,1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listPM()  {
        //---------------------------------------------------
        List<CarParkManage> a1 = null;
        try {

            a1 = parkManageService.listPM();
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }


    @Test
    void savePM()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {
            CarParkManage entity =new CarParkManage();
            entity.setId(1);
            entity.setName("Test");
            entity.setFreeTime("30min");
            a1 = parkManageService.savePM(entity);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void savePM2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = parkManageService.savePM(null);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }


    @Test
    void getByCarParkId()  {
        //---------------------------------------------------
        AppPayConfig a1 = null;
        try {

            a1 = payManageService.getByCarParkId(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getByCarParkId2()  {
        //---------------------------------------------------
        AppPayConfig a1 = null;
        try {

            a1 = payManageService.getByCarParkId(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void deleteP()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = payManageService.deleteP(1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void deleteP2()  {
        //---------------------------------------------------
        Boolean a1 = false;
        try {

            a1 = payManageService.deleteP(100);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void selectByUser()  {
        //---------------------------------------------------
        List<SysRole> a1 = null;
        try {

            a1 = roleService.selectByUser();
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getMenuByRole()  {
        //---------------------------------------------------
        List<SysMenu> a1 = null ;
        try {

            a1 = roleService.getMenuByRole(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void getMenuByRole2()  {
        //---------------------------------------------------
        List<SysMenu> a1 = null ;
        try {

            a1 = roleService.getMenuByRole(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void saveMenuByRole()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {

            a1 = roleService.saveMenuByRole(1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void saveMenuByRole2()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {

            a1 = roleService.saveMenuByRole(100);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getOrgByRole()  {
        //---------------------------------------------------
        SysOrg a1 = null ;
        try {

            a1 = roleService.getOrgByRole(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void getOrgByRole2()  {
        //---------------------------------------------------
        SysOrg a1 = null ;
        try {

            a1 = roleService.getOrgByRole(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void saveOrgByRole()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {

            a1 = roleService.saveOrgByRole(1);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void saveOrgByRole2()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {

            a1 = roleService.saveOrgByRole(100);
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void updateInfo()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {
            a1 = userManageService.updateInfo(1,"ttt");
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void updateInfo2()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {
            a1 = userManageService.updateInfo(100,"ttt");
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void info()  {
        //---------------------------------------------------
        SysUser a1 = null ;
        try {
            a1 = userManageService.info(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void info2()  {
        //---------------------------------------------------
        SysUser a1 = null ;
        try {
            a1 = userManageService.info(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void updatePwd()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {
            a1 = userManageService.updatePwd(1,"12345");
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void updatePwd2()  {
        //---------------------------------------------------
        Boolean a1 = false ;
        try {
            a1 = userManageService.updatePwd(100,"12345");
        } catch (Exception e) {
//            e.printStackTrace();
//            a1 = null ;
            a1 = false ;
        }
//        if(a1==null || a1.size()==0){
//            a1 = null ;
//        }
//        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listUserByRole()  {
        //---------------------------------------------------
        List<SysUser> a1 = null ;
        try {
            a1 = userManageService.listUserByRole(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listUserByRole2()  {
        //---------------------------------------------------
        List<SysUser> a1 = null ;
        try {
            a1 = userManageService.listUserByRole(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }
    @Test
    void listUserPerms()  {
        //---------------------------------------------------
        List<String> a1 = null ;
        try {
            a1 = userManageService.listUserPerms(100);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
        Assertions.assertNull(a1);
//        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    @Test
    void listUserPerms2()  {
        //---------------------------------------------------
        List<String> a1 = null ;
        try {
            a1 = userManageService.listUserPerms(1);
        } catch (Exception e) {
//            e.printStackTrace();
            a1 = null ;
//            a1 = false ;
        }
        if(a1==null || a1.size()==0){
            a1 = null ;
        }
//        Assertions.assertNull(a1);
        Assertions.assertNotNull(a1);
//        Assertions.assertEquals(true,a1);
//        Assertions.assertEquals(false,a1);
        //---------------------------------------------------
    }

    //-----------------------------------------------------------

    @Test
    void createSysMenu()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.createSysMenu(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createSysMenu2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            //已创建id为1的User对象
            a2 = parkSystem.createSysMenu(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void querySysMenu()  {

        //创建用户
        //---------------------------------------------------
        SysMenu a2 = null;
        try {
//            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
            a2 = parkSystem.querySysMenu(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }


    @Test
    void querySysMenu2()  {

        //创建用户
        //---------------------------------------------------
        SysMenu a2 = null;
        try {
//            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = parkSystem.querySysMenu(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }



    @Test
    void modifySysMenu()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysMenu(1,"菜单1");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void modifySysMenu2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysMenu(1,"菜单2");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteSysMenu()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysMenu(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteSysMenu2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysMenu(10);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }



    //-----------------------------------------------------------

    @Test
    void createUser()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.createUser(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createUser2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            //已创建id为1的User对象
            a2 = parkSystem.createUser(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void queryUser()  {

        //创建用户
        //---------------------------------------------------
        SysUser a2 = null;
        try {
//            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
            a2 = parkSystem.queryUser(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }


    @Test
    void queryUser2()  {

        //创建用户
        //---------------------------------------------------
        SysUser a2 = null;
        try {
//            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = parkSystem.queryUser(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }



    @Test
    void modifyUser()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifyUser(1,"zhc");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyUser2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifyUser(1,"zsh");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteUser()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteUser(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteUser2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteUser(10);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }



    //-----------------------------------------------------------

    @Test
    void createSysOrg()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.createSysOrg(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createSysOrg2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            //已创建id为1的User对象
            a2 = parkSystem.createSysOrg(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void querySysOrg()  {

        //创建用户
        //---------------------------------------------------
        SysOrg a2 = null;
        try {
//            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
            a2 = parkSystem.querySysOrg(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }


    @Test
    void querySysOrg2()  {

        //创建用户
        //---------------------------------------------------
        SysOrg a2 = null;
        try {
//            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = parkSystem.querySysOrg(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }



    @Test
    void modifySysOrg()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysOrg(1,"开发部");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void modifySysOrg2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysOrg(1,"开发部");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteSysOrg()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysOrg(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteSysOrg2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysOrg(10);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }



    //-----------------------------------------------------------

    @Test
    void createSysRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.createSysRole(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createSysRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            //已创建id为1的User对象
            a2 = parkSystem.createSysRole(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void querySysRole()  {

        //创建用户
        //---------------------------------------------------
        SysRole a2 = null;
        try {
//            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
            a2 = parkSystem.querySysRole(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }


    @Test
    void querySysRole2()  {

        //创建用户
        //---------------------------------------------------
        SysRole a2 = null;
        try {
//            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = parkSystem.querySysRole(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }



    @Test
    void modifySysRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysRole(1,"权限1");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void modifySysRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.modifySysRole(1,"权限1");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteSysRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysRole(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteSysRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = parkSystem.deleteSysRole(10);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
}
