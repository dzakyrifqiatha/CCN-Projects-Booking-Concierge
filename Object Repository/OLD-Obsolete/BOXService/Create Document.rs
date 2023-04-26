<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Document</name>
   <tag></tag>
   <elementGuidId>75359deb-821f-4aba-a00a-1fdc28797677</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;encodedContent\&quot;:\&quot;${encodedContent}\&quot;,\n  \&quot;contentType\&quot;:\&quot;${contentType}\&quot;,\n  \&quot;contentMIME\&quot;:\&quot;${contentMIME}\&quot;,\n  \&quot;contentName\&quot;:\&quot;${contentName}\&quot;,\n  \&quot;tags\&quot;:[\&quot;${tag1}\&quot;,\&quot;${tag2}\&quot;,\&quot;${tag3}\&quot;,\&quot;${tag4}\&quot;,\&quot;${tag5}\&quot;]\n}&quot;,
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
   <restUrl>http://cube.ppd.ccn/ad038c3fb8bda23f9fb11d1425b2ff10/document</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(1, 1)</defaultValue>
      <description></description>
      <id>07e52f87-e581-4d9d-b57a-11d28330b3e9</id>
      <masked>false</masked>
      <name>encodedContent</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(2, 1)</defaultValue>
      <description></description>
      <id>ea8d0d56-b7c6-4d27-a152-7d9f29710b63</id>
      <masked>false</masked>
      <name>contentType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(3, 1)</defaultValue>
      <description></description>
      <id>3f9397cd-4489-419e-92da-9818de2fa9e2</id>
      <masked>false</masked>
      <name>contentMIME</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(4, 1)</defaultValue>
      <description></description>
      <id>7b257484-c67c-44e5-89c9-8e0311eabf31</id>
      <masked>false</masked>
      <name>contentName</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(5, 1)</defaultValue>
      <description></description>
      <id>8c9ede65-8e46-4cc9-8768-7f39295fac8c</id>
      <masked>false</masked>
      <name>tag1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(6, 1)</defaultValue>
      <description></description>
      <id>c405cbe0-6678-417b-b5f8-997b60a4518e</id>
      <masked>false</masked>
      <name>tag2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(7, 1)</defaultValue>
      <description></description>
      <id>5201619d-1851-4c69-a7aa-1d64a33027bb</id>
      <masked>false</masked>
      <name>tag3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(8, 1)</defaultValue>
      <description></description>
      <id>8c4e6489-7a9c-466b-8431-a9601850b980</id>
      <masked>false</masked>
      <name>tag4</name>
   </variables>
   <variables>
      <defaultValue>findTestData('BOXService/TD_BoxDocument').getValue(9, 1)</defaultValue>
      <description></description>
      <id>6dd698f2-7764-4e36-bcc7-50d77e65345a</id>
      <masked>false</masked>
      <name>tag5</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.var_DocumentID</defaultValue>
      <description></description>
      <id>210fb1b8-c348-445d-97f5-acc578718fb4</id>
      <masked>false</masked>
      <name>documentID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.var_DocumentVersionID</defaultValue>
      <description></description>
      <id>2b45e6f2-d9af-4d1f-9fa6-06848cbc5914</id>
      <masked>false</masked>
      <name>documentVersionID</name>
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
