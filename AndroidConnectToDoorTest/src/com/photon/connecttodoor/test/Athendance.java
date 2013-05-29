package com.photon.connecttodoor.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;
import com.photon.connecttodoor.LoginActivity;
import com.photon.connecttodoor.R;

public class Athendance extends ActivityInstrumentationTestCase2<LoginActivity> {
	
	private Solo solo;
	boolean expected = true;
	   boolean actual;
	
	public Athendance() {
	               super(LoginActivity.class);

	       }

	       @Override
	       public void setUp() throws Exception {

	               super.setUp();
	               solo = new Solo(getInstrumentation(), getActivity());

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
	    	   solo.clickOnButton(0);
	    	   actual = solo.searchText("Welcome");
	    	   assertEquals(expected, actual);
	    	   
	       }
	       
	       public void testProfile(){
	    	   //buddy ganteng
	    	   solo.clickOnButton(0);
	    	   solo.clickOnButton("Voucher");
	    	   actual = solo.searchButton("Attendace");
	    	   assertEquals(expected, actual);
	       }
	       
}
