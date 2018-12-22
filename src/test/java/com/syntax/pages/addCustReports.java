package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class addCustReports extends BaseClass {
	// TimeModule link
	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']")
	public WebElement timeModule;

	// ProjectInfo link
	@FindBy(xpath = "//a[@id='menu_admin_ProjectInfo']")
	public WebElement projectInfo;

	// ViewCustomersLink
	@FindBy(xpath = "//a[@id='menu_admin_viewCustomers']")
	public WebElement viewCustomers;

	// Button Add
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement btnAdd;

	// Adding Customer Box
	@FindBy(xpath = "//input[@id='addCustomer_customerName']")
	public WebElement customerName;

	// Adding Customer Description
	@FindBy(xpath = "//textarea[@id='addCustomer_description']")
	public WebElement customerDesc;

	// Button Save
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement btnSave;

	@FindBy(xpath="//table[@id='resultTable']//tbody")
	public WebElement resultTable;
	
	// View Project Link
	@FindBy(xpath = "//a[@id='menu_admin_viewProjects']")
	public WebElement viewProjects;

	// Add Customer Name
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[1]/input[1]")
	public WebElement addcustomerName;

	// Save Button
	@FindBy(xpath = "//input[@id='dialogSave']")
	public WebElement clickSave;

	// Project Name box
	@FindBy(xpath = "//input[@id='addProject_projectName']")
	public WebElement projectName;

	// Project Admin box
	@FindBy(xpath = "//input[@id='addProject_projectAdmin_1']")
	public WebElement projectAdmin;

	// Time Reports Link
	@FindBy(xpath = "//a[@id='menu_time_Reports']")
	public WebElement timeReports;

	// Project Reports Link
	@FindBy(xpath = "//a[@id='menu_time_displayProjectReportCriteria']")
	public WebElement projectReports;

	// Find Project Name
	@FindBy(xpath = "//*[@id='time_project_name']")
	public WebElement findProjectName;

	// View Button
	@FindBy(xpath = "//input[@id='viewbutton']")
	public WebElement viewBtn;

	// Confirm Customer Project
	@FindBy(xpath = "//dl[@class='search-params']")
	public WebElement confirmCustProj;

	public addCustReports() {
		PageFactory.initElements(driver, this);

	}
}
