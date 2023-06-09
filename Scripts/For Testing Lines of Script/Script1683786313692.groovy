import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.utils.CommonFunctionsVer1

import internal.GlobalVariable

'Arrange'
// Instantiate
CommonFunctionsVer1 CF = new CommonFunctionsVer1(
	folder: "Promotexter",
	testCaseID: "1",
	function: "General and Sales Inquiry",
)
// Test Objects
TestObject passFlag = CF.getRuntimeObj('Unauthenticated', 'Contact Us_Middle_Error_Label')
TestObject inputName = CF.getRuntimeObj('Unauthenticated', 'Contact Us_Middle_Name_Input')
// Local Variables
String name = "Testy McTest"
List<List> inputs = [[inputName, name]]
// Some of Arrange are in Profiles > default 

'Act'
CF.initialize(GlobalVariable.siteUrls['Promotexter_ContactUs'])
// Most of Act are in Keywords > com.utils > CommonFunctionsVer1

'Assert'
WebUI.setText(inputName, name)