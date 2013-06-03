package com.photon.connecttodoor.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.jayway.android.robotium.solo.Solo;
import com.photon.connecttodoor.LoginActivity;
import com.photon.connecttodoor.R;

public class Athendance extends ActivityInstrumentationTestCase2<LoginActivity> {
	
	private Solo solo;
	boolean expected = true;
	   boolean actual;
	public Button backbutton;
	public Athendance() {
	               super(LoginActivity.class);

	       }

	       @Override
	       public void setUp() throws Exception {

	               super.setUp();
	               solo = new Solo(getInstrumentation(), getActivity());
	               backbutton = (Button)solo.getCurrentActivity().findViewById(R.id.back_button);
	       }

	       @Override
	       public void tearDown() throws Exception {

	               try {
	                       solo.finalize();
	               } catch (Throwable e) {
	                       // TODO: handle exception
	                       e.printStackTrace();
	               }
	               getActivity().finish();
	               solo.finishOpenedActivities();
	               super.tearDown();
	       }
	       
	       
	       public void testLoginFb(){
//			   Open App	    	   
	    	   // tap FB
	    	   solo.clickOnButton(0);
	    	   solo.waitForActivity("km", 2000);
	    	   
	    	   actual = solo.searchText("Employee ID", true);
	    	   solo.waitForActivity("km", 2000);
	    	   assertEquals(expected, actual);
	    	   solo.waitForActivity("km", 2000);
	    	   // input employee ID
	    	   solo.enterText(0, "i0068");
	    	   solo.waitForActivity("km", 2000);
	    	   // tap continue
	    	   solo.clickOnButton(0);
	    	   solo.waitForActivity("km", 2000);
	    	  System.out.println("Login Success");

//	      	   Test Profile in App
	    	   // tap Profile
	    	   solo.clickOnImage(3);
	    	   solo.waitForActivity("km", 2000);
	    	   // tap attendance
	    	   solo.clickOnImage(1);
	    	   solo.waitForActivity("km", 2000);
	    	   System.out.println("Test Profile Success");
	    	   
//			   Test Voucher     
//			   tap Voucher
	    	   solo.clickOnImage(4);
	    	   solo.waitForActivity("km", 2000);
	    	   // tap back
//	    	   solo.getCurrentActivity().findViewById(R.id.);
	    	   solo.clickOnButton("Back");
//	    	   solo.clickOnButton(0);
//	    	   solo.clickOnImage(0);
	    	   solo.waitForActivity("km", 3000);
	    	   System.out.println("Test Voucher Success");
	    	   
////			   Testing Daily Attendance
//	    	   // Tap daily Attendance
//	    	   solo.clickOnImage(5);
//	    	   solo.waitForActivity("km", 3000);
//	    	   solo.getCurrentActivity().findViewById(R.id.backButton);
////	    	   solo.clickOnButton(1);
//	    	   solo.waitForActivity("km", 3000);
//	    	   System.out.println("Testing Daily Success");
//	    	   
	    	   
////			   Testing Attendance List
//	    	   // Tap Attendance List
//	    	   solo.clickOnImage(6);
//	    	   solo.waitForActivity("km", 3000);
//	      
	       }
//	       
//	       public void testProfile(){
//	    	   //buddy ganteng
//	    	   solo.clickOnButton(0);
//	    	   solo.clickOnImageButton(0);
//	    	   solo.clickOnButton("Voucher");
//	    	   actual = solo.searchButton("Attendace");
//	    	   assertEquals(expected, actual);
//	       }
//	       
}
