package jp.co.internous.team2504.model.domain;

import jp.co.internous.team2504.model.form.UserForm;

/**
 * mst_userのドメイン
 * @author インターノウス
 *
 */
public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int gender;
	
	public MstUser() {
	}
	
	public MstUser(UserForm f) {
		setUserName(f.getUserName());
		setPassword(f.getPassword());
		setFamilyName(f.getFamilyName());
		setFirstName(f.getFirstName());
		setFamilyNameKana(f.getFamilyNameKana());
		setFirstNameKana(f.getFirstNameKana());
		setGender(f.getGender());
	}
	
	public MstUser(int id, String userName, String password, String familyName, 
		String firstName, String familyNameKana, String firstNameKana, int gender) {
		this.id = id; 
		this.userName = userName;
		this.password = password;
		this.familyName = familyName;
		this.firstName = firstName;
		this.familyNameKana = familyNameKana;
		this.firstNameKana = firstNameKana;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	
}
