<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Group</name>
   <tag></tag>
   <elementGuidId>fc542b9e-b28a-4c60-8436-c2a2e9f246d5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;groupName\&quot;:\&quot;testgroup_1656\&quot;,\n  \&quot;contacts\&quot;:[\&quot;songmy@ccn.com.sg\&quot;,\&quot;testingbc3@hotmail.com\&quot;],\n  \&quot;rules\&quot;: [\n   \t{\n   \t\t\&quot;tags\&quot;:[\&quot;${tag3}\&quot;,\&quot;${tag4}\&quot;],\n   \t\t\&quot;contentType\&quot;:\&quot;${contentType}\&quot;\n   \t}\n  ]\n}&quot;,
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
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://cube.ppd.ccn/ad038c3fb8bda23f9fb11d1425b2ff10/group</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(1, 1)</defaultValue>
      <description></description>
      <id>3ea2a297-98d7-45dd-8526-367cad53d537</id>
      <masked>false</masked>
      <name>groupName</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(2, 1)</defaultValue>
      <description></description>
      <id>1fcff0e1-6e3c-401a-8c84-617257980d4c</id>
      <masked>false</masked>
      <name>contact1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(3, 1)</defaultValue>
      <description></description>
      <id>9fbfe75f-7ce3-4f1f-b9b4-efd52fa99db0</id>
      <masked>false</masked>
      <name>contact2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(4, 1)</defaultValue>
      <description></description>
      <id>0995d8af-8092-4682-b08e-46c0f6d3d0b2</id>
      <masked>false</masked>
      <name>contact3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(5, 1)</defaultValue>
      <description></description>
      <id>6ff245c5-4e1f-4ea8-ac63-bc4ebaaacd8c</id>
      <masked>false</masked>
      <name>tag1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(6, 1)</defaultValue>
      <description></description>
      <id>f7b78134-dd48-4ef1-be2f-9ea0c21402f1</id>
      <masked>false</masked>
      <name>tag2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(7, 1)</defaultValue>
      <description></description>
      <id>f248372e-05ce-4e21-bb2e-f1d474b5ad9f</id>
      <masked>false</masked>
      <name>tag3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(8, 1)</defaultValue>
      <description></description>
      <id>38a9e04a-4500-49cd-b482-53b6ce9b47b1</id>
      <masked>false</masked>
      <name>tag4</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(9, 1)</defaultValue>
      <description></description>
      <id>eeec3882-d87f-430c-a2b4-17f881afb712</id>
      <masked>false</masked>
      <name>tag5</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxGroup').getValue(10, 1)</defaultValue>
      <description></description>
      <id>91ec1c80-a7c0-42d3-aa84-3f18bad35eb7</id>
      <masked>false</masked>
      <name>contentType</name>
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
