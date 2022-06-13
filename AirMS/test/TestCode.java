package spring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import spring.net.mydream.controller.RepairServiceController;
import spring.net.mydream.entity.*;
import spring.net.mydream.redis.CurrentUtils;
import spring.net.mydream.service.*;
import spring.net.mydream.utils.PreconditionException;

import java.util.List;

import static org.mockito.Mockito.when;


@SpringBootTest
public class TestCode {
//  @MockBean
//  @SpyBean
    @Autowired
    private AirportSystem airportSystem;
    @Autowired
    private RoutineService routineService;
    @Autowired
    private RepairService repairService;
    @Autowired
    private HandleService hndleService;
    @Autowired
    private MaintainService maintainService;
    @Autowired
    private ManageService manageService;

    @Test
    void createUser1()  {
        //创建用户
        //---------------------------------------------------
        Boolean a1 = null;
        try {
//            when(airportSystem.createUser(100,"zhc","123","166",1000,1)).thenReturn(false);
            a1 = airportSystem.createUser(100,"zhc","123","166",1000,1);

        } catch (PreconditionException e) {
            a1 = false ;
        }
        Assertions.assertEquals(true,a1);
        //---------------------------------------------------

    }

    @Test
    void createUser2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createUser(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = airportSystem.createUser(1,"zhc","123","166",1000,1);

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
        User a2 = null;
        try {
//            when(airportSystem.queryUser(1,"zhc","123","166",1000,1)).thenReturn(true);
           a2 = airportSystem.queryUser(1);

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
        User a2 = null;
        try {
//            when(airportSystem.queryUser(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = airportSystem.queryUser(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }
    @Test
    void modifyUser1()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.modifyUser(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = airportSystem.modifyUser(1,"zhc","123","166",1000,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyUser2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.modifyUser(1,"zhc","123","166",100,1)).thenReturn(true);
            a2 = airportSystem.modifyUser(1,"zhc","123","166",100,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteUser()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.deleteUser(1)).thenReturn(true);
            a2 = airportSystem.deleteUser(1);

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
//            when(airportSystem.deleteUser(1).thenReturn(true);
            a2 = airportSystem.deleteUser(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void createRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createRole(5,"权限5",5000);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createRole(1,"权限5",1000);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void queryRole()  {

        //创建用户
        //---------------------------------------------------
        Role a2 = null;
        try {
//            when(airportSystem.queryRole(5,"权限5",4000).thenReturn(true);
            a2 = airportSystem.queryRole(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }


    @Test
    void queryRole2()  {

        //创建用户
        //---------------------------------------------------
        Role a2 = null;
        try {
//            when(airportSystem.queryRole(1,"zhc","123","166",1000,1)).thenReturn(true);
            a2 = airportSystem.queryRole(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }



    @Test
    void modifyRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyRole(5,"权限5",5000);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyRole(1,"权限5",1000);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteRole()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteRole(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteRole2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteRole(10);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void createDepartment()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDepartment(10,"department1","zhang1","zhao1","1886595XXXX","该部门主要负责。。。","部门1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createDepartment2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDepartment(1,"department1","zhang1","zhao1","1886595XXXX","该部门主要负责。。。","部门1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void queryDepartment()  {

        //创建用户
        //---------------------------------------------------
        Department a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDepartment(10);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryDepartment2()  {

        //创建用户
        //---------------------------------------------------
        Department a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDepartment(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyDepartment()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDepartment(1,"department1","zhang1","zhao1","1886595XXXX","该部门主要负责。。。","部门1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyDepartment2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDepartment(100,"department1","zhang1","zhao1","1886595XXXX","该部门主要负责。。。","部门1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void deleteDepartment()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDepartment(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteDepartment2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDepartment(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void createDeviceInfo()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceInfo(10,"风机","联像","1","进站口","wang","wang","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createDeviceInfo2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceInfo(10,"风机","联像","1","进站口","wang","wang","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void queryDeviceInfo()  {

        //创建用户
        //---------------------------------------------------
        DeviceInfo a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceInfo(10);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceInfo2()  {

        //创建用户
        //---------------------------------------------------
        DeviceInfo a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceInfo(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyDeviceInfo()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceInfo(1,"风机","联像","1","进站口","wang","wang","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyDeviceInfo2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceInfo(10,"风机","联像","1","进站口","wang","wang","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void deleteDeviceInfo()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceInfo(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteDeviceInfo2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceInfo(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void createDeviceLocationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceLocationGroup(10,"分组1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createDeviceLocationGroup2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceLocationGroup(10,"分组1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceLocationGroup()  {

        //创建用户
        //---------------------------------------------------
        DeviceLocationGroup a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceLocationGroup(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceLocationGroup2()  {

        //创建用户
        //---------------------------------------------------
        DeviceLocationGroup a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceLocationGroup(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyDeviceLocationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceLocationGroup(1,"分组1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyDeviceLocationGroup2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceLocationGroup(1,"分组1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void deleteDeviceLocationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceLocationGroup(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteDeviceLocationGroup2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceLocationGroup(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }









    @Test
    void createEquipmentFailureType()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createEquipmentFailureType(1,"error1","错误","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createEquipmentFailureType2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createEquipmentFailureType(10,"error1","错误","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void queryEquipmentFailureType()  {

        //创建用户
        //---------------------------------------------------
        EquipmentFailureType a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryEquipmentFailureType(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryEquipmentFailureType2()  {

        //创建用户
        //---------------------------------------------------
        EquipmentFailureType a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryEquipmentFailureType(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyEquipmentFailureType()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyEquipmentFailureType(1,"error1","错误","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyEquipmentFailureType2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyEquipmentFailureType(10,"error1","错误","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void deleteEquipmentFailureType()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteEquipmentFailureType(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteEquipmentFailureType2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteEquipmentFailureType(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }




    @Test
    void createDeviceStatus()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceStatus(1,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createDeviceStatus2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceStatus(10,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceStatus()  {

        //创建用户
        //---------------------------------------------------
        DeviceStatus a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceStatus(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceStatus2()  {

        //创建用户
        //---------------------------------------------------
        DeviceStatus a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceStatus(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyDeviceStatus()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceStatus(10,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyDeviceStatus2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceStatus(10,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void deleteDeviceStatus()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceStatus(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteDeviceStatus2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceStatus(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }




    @Test
    void createDeviceAssociationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceAssociationGroup(1,"关联1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void createDeviceAssociationGroup2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.createDeviceAssociationGroup(10,"关联1","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceAssociationGroup()  {

        //创建用户
        //---------------------------------------------------
        DeviceAssociationGroup a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceAssociationGroup(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void queryDeviceAssociationGroup2()  {

        //创建用户
        //---------------------------------------------------
        DeviceAssociationGroup a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.queryDeviceAssociationGroup(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void modifyDeviceAssociationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceAssociationGroup(10,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void modifyDeviceAssociationGroup2()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.modifyDeviceAssociationGroup(10,"running","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    @Test
    void deleteDeviceAssociationGroup()  {

        //创建用户
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceAssociationGroup(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void deleteDeviceAssociationGroup2()  {

        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = airportSystem.deleteDeviceAssociationGroup(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }


    //-------------------------------------------------------------------------------

    @Test
    void userLogin()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = routineService.userLogin("zhang2","123456");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void userLogin2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = routineService.userLogin("zhang3","123");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void workReportSubmit()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = routineService.workReportSubmit("zhang3","今日工作","","");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void submitRepair()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {
//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.submitRepair(1,1,"zhc","132...","",1,"1","",1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void submitRepair2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.submitRepair(1,1,"zhc","132...","",1,"1","",100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void notAcceptAa()  {
        //---------------------------------------------------
        List<TbRepair> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.notAcceptAa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void acceptedAa()  {
        //---------------------------------------------------
        List<TbRepair> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.acceptedAa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void completedAa()  {
        //---------------------------------------------------
        List<TbRepair> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.completedAa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void scoring()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.scoring(1,5,"");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void scoring2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.scoring(1000,5,"");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void tbInfo()  {
        //---------------------------------------------------
        TbRepair a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.tbInfo(1);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void tbInfo2()  {
        //---------------------------------------------------
        TbRepair a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = repairService.tbInfo(1000);

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNull(a2);
        //---------------------------------------------------

    }

    @Test
    void notAcceptBa()  {
        //---------------------------------------------------
        List<TbRepairExtra> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.notAcceptBa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void acceptedBa()  {
        //---------------------------------------------------
        List<TbRepairExtra> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.acceptedBa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }
    @Test
    void completedBa()  {
        //---------------------------------------------------
        List<TbRepairExtra> a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.completedBa();

        } catch (PreconditionException e) {
            a2 = null ;
        }
        Assertions.assertNotNull(a2);
        //---------------------------------------------------

    }

    @Test
    void allocation()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.allocation(1,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void allocation2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.allocation(100,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void transmit()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.transmit(1,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void transmit2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.transmit(100,1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void backtransmit()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.backtransmit(1,"reject");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void backtransmit2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.backtransmit(100,"reject");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void setWorkTask()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.setWorkTask("zhc","候机楼","1880000","test","remark");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void setTerminalEquipment()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = hndleService.setTerminalEquipment("zhc","shandong","11",1,"remark",1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void receiveTb()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.receiveTb(1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void receiveTb2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.receiveTb(100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void completeTb()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.completeTb(1,"漏水","堵上");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void completeTb2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.completeTb(100,"漏水","堵上");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void rocessingFees()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.rocessingFees(1,"修补",100.0,10,"");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void rocessingFees2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.rocessingFees(100,"修补",100.0,10,"");

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
    @Test
    void setOperationStatus()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.setOperationStatus("zhc","100","ms","1","",1);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void setOperationStatus2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = maintainService.setOperationStatus("zhc","100","ms","1","",100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void arbitration()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = manageService.arbitration(1,100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }

    @Test
    void arbitration2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = manageService.arbitration(100,100);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }

    @Test
    void approval()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = manageService.approval(1,true);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(true,a2);
        //---------------------------------------------------

    }
    @Test
    void approval2()  {
        //---------------------------------------------------
        Boolean a2 = null;
        try {

//            when(airportSystem.createRole(5,"权限5",5000).thenReturn(true);
            a2 = manageService.approval(100,true);

        } catch (PreconditionException e) {
            a2 = false ;
        }
        Assertions.assertEquals(false,a2);
        //---------------------------------------------------

    }
}

