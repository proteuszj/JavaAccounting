
package com.proteuszj.Accounting;

import java.util.Date;

/**
 * @author zhangjun
 * Base of all account class
 */
public abstract class Account
{
	/**
	 * Whether checked on UI
	 */
	boolean Checked;
	
	/**
	 * Date when the account was created
	 */
	Date CreatedTime;

	/**
	 * Description of account
	 */
	String Description;
	
	/**
	 * Issuer of the account
	 */
	String Issuer;
	
	/**
	 * Unique Name of the account
	 */
	String Name;
	
	/**
	 * Number of the account
	 */
	String Number;
	
	/**
	 * Owner name of the account
	 */
	String Owner;
	
}

