<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Share Document</name>
   <tag></tag>
   <elementGuidId>bd668c01-4128-4e20-ae10-f0743f41733a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;documentID\&quot;:\&quot;5f33af6538c5b2001063bfd7\&quot;,\n  \&quot;contacts\&quot;:[\&quot;testingdev22@yahoo.com\&quot;]\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://cube.ppd.ccn/ad038c3fb8bda23f9fb11d1425b2ff10/document/share</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(9, 1)</defaultValue>
      <description></description>
      <id>686062bb-9111-4c5e-ae0d-0529d43ccd5f</id>
      <masked>false</masked>
      <name>documentID</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxUser').getValue(1, 2)</defaultValue>
      <description></description>
      <id>9b8384be-b4f9-4f06-8828-0810f1b3449e</id>
      <masked>false</masked>
      <name>contact1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxUser').getValue(1, 3)</defaultValue>
      <description></description>
      <id>258108e7-65a9-4738-913f-9e26c2e2ae1e</id>
      <masked>false</masked>
      <name>contact2</name>
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
