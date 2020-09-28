<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Document - Copy</name>
   <tag></tag>
   <elementGuidId>9bb0b959-1c77-4ce3-9a2b-aff2471d95a4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;documentID\&quot;: \&quot;5f33af66ee0cfe0012a31ddf\&quot;,\n  \&quot;isRead\&quot;: true\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>http://cube.ppd.ccn/f66fed2071bce274b7445ba2ec96835f/document/read</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.var_DocumentID</defaultValue>
      <description></description>
      <id>6735b443-a9a8-4959-866d-612599a4b45d</id>
      <masked>false</masked>
      <name>documentID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.var_DocumentVersionID</defaultValue>
      <description></description>
      <id>39421e41-18da-41d5-8ea0-97b465a74b8f</id>
      <masked>false</masked>
      <name>documentVersionID</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(1, 1)</defaultValue>
      <description></description>
      <id>ff171ec7-870b-4341-8904-d4c91ba417a2</id>
      <masked>false</masked>
      <name>encodedContent</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(2, 1)</defaultValue>
      <description></description>
      <id>4df757a1-fdf5-432d-be92-102dc1d17363</id>
      <masked>false</masked>
      <name>contentType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(3, 1)</defaultValue>
      <description></description>
      <id>37ff76a9-7246-4bc8-b588-c2cfa151311d</id>
      <masked>false</masked>
      <name>contentName</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(4, 1)</defaultValue>
      <description></description>
      <id>fff69979-ca4e-403c-bca7-70ff808b15fa</id>
      <masked>false</masked>
      <name>tag1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(5, 1)</defaultValue>
      <description></description>
      <id>80000270-7d51-4c63-9693-c2b18ff8229c</id>
      <masked>false</masked>
      <name>tag2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(6, 1)</defaultValue>
      <description></description>
      <id>2a16b233-b0cf-46b6-9ed2-2f0685a84449</id>
      <masked>false</masked>
      <name>tag3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(7, 1)</defaultValue>
      <description></description>
      <id>5bb80489-68ee-4889-8f2a-1d7386ed3125</id>
      <masked>false</masked>
      <name>tag4</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(8, 1)</defaultValue>
      <description></description>
      <id>9aef12fa-1355-4729-8931-f6d588a57c0e</id>
      <masked>false</masked>
      <name>tag5</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
