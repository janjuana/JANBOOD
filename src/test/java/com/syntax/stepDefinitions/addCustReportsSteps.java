package com.syntax.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.pages.addCustReports;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class addCustReportsSteps extends BaseClass {
	addCustReports custReport;

	@When("^I click on Time Module$")
	public void i_click_on_Time_Module() {
		custReport = new addCustReports();
		CommonMethods.click(custReport.timeModule);
	}

	@When("^I click on Project Info$")
	public void i_click_on_Project_Info() {
		CommonMethods.click(custReport.projectInfo);
	}

	@When("^I click on Customers$")
	public void i_click_on_Customers() {
		CommonMethods.click(custReport.viewCustomers);
	}

	@When("^I click on Add Button$")
	public void i_click_on_Add_Button() {
		CommonMethods.click(custReport.btnAdd);
	}

	@When("^I input a \"([^\"]*)\"$")
	public void i_input_a(String arg1) {
		CommonMethods.enterValue(custReport.customerName, arg1);
	}

	@When("^I input the \"([^\"]*)\"$")
	public void i_input_the(String arg1) {
		CommonMethods.enterValue(custReport.customerDesc, arg1);
	}

	@When("^I click Save$")
	public void i_click_Save() {
		CommonMethods.click(custReport.btnSave);
	}

	@Then("^I see the \"([^\"]*)\"$")
	public void i_see_the(String arg1) {
		List<WebElement> irows = custReport.resultTable.findElements(By.tagName("tr"));
		int irowsCount = irows.size();
		for (int i = 1; i <= irowsCount; i++) {
			WebElement name = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+i+"]"));
			Boolean rowdata = name.isDisplayed();
			Assert.assertTrue(arg1, rowdata);
		}
	}

	@When("^I select Projects$")
	public void i_select_Projects() {
		CommonMethods.click(custReport.viewProjects);
	}

	@When("^I click Add button$")
	public void i_click_Add_button() throws InterruptedException {
		CommonMethods.click(custReport.btnAdd);
		Thread.sleep(3000);
	}

	@When("^I input same \"([^\"]*)\"$")
	public void i_input_same(String arg1) {
		CommonMethods.Action(custReport.addcustomerName, arg1);
	}

	@When("^I add the \"([^\"]*)\"$")
	public void i_add_the(String arg1) {
		CommonMethods.Action(custReport.projectName, arg1);
	}

	@When("^I add \"([^\"]*)\"$")
	public void i_add(String arg1) {
		CommonMethods.Action(custReport.projectAdmin, arg1);
	}

	@Then("^I see \"([^\"]*)\" is saved$")
	public void i_see_is_saved(String arg1) {
		List<WebElement> confirmRows = custReport.resultTable.findElements(By.tagName("tr"));
		int confirmRowsCount = confirmRows.size();
		for (int j = 1; j <= confirmRowsCount; j++) {
			WebElement rowsTable = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+j+"]"));
			Boolean rowsTableData = rowsTable.isDisplayed();
			Assert.assertTrue(arg1, rowsTableData);
		}
	}

	@When("^I click on Project Reports$")
	public void i_click_on_Project_Reports() {
		CommonMethods.click(custReport.timeReports);
		CommonMethods.click(custReport.projectReports);
	}

	@When("^I enter \"([^\"]*)\" from previous entry$")
	public void i_enter_from_previous_entry(String arg1) {
		CommonMethods.Select(custReport.findProjectName, arg1);
	}

	@When("^click View$")
	public void click_View() {
		CommonMethods.click(custReport.viewBtn);
	}

	@Then("^\"([^\"]*)\" displayed$")
	public void displayed(String arg1) {
		String confirmReport = custReport.confirmCustProj.getText();
		Boolean check1 = custReport.confirmCustProj.isDisplayed();
		Assert.assertTrue(arg1, check1);

	}
}
