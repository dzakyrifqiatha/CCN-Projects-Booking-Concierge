<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Document</name>
   <tag></tag>
   <elementGuidId>6e78933f-ed36-4731-b8bb-d5259ee65751</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;documentID\&quot;: \&quot;5f19023b6b00f20010f7343a\&quot;\n}&quot;,
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
   <restUrl>https://cubedev.ccnexchange.com/00d61ecde27c9c4aee788d1c57ff2948/document</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>1dc1491c-4cfa-484a-8c71-42b224cc2fdb</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>308e2a09-c4de-4278-99b2-ee9f292f67c3</id>
      <masked>false</masked>
      <name>variable_0</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>13e1cd62-3c0c-44a3-8f96-19f9f7872feb</id>
      <masked>false</masked>
      <name>variable_1</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f97467e8-2806-42a7-b258-9d8aadcd1989</id>
      <masked>false</masked>
      <name>variable_2</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d9f538ad-d05e-4631-baa4-d1599f5ff715</id>
      <masked>false</masked>
      <name>variable_3</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>754ad50d-cb80-4f3d-ae5c-731575b04350</id>
      <masked>false</masked>
      <name>variable_4</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>8d1084be-8887-4676-b5d4-479f2230b30b</id>
      <masked>false</masked>
      <name>variable_5</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d87f3007-0155-48ad-b430-350e2e0adc43</id>
      <masked>false</masked>
      <name>variable_6</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>2cba481a-c252-4bb3-80c6-0431a32379c4</id>
      <masked>false</masked>
      <name>variable_7</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>fbf3c107-786c-440c-8293-48a7fe2fc039</id>
      <masked>false</masked>
      <name>variable_8</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>9421ca82-b1a2-43fb-8ae1-b8d0f679d208</id>
      <masked>false</masked>
      <name>variable_9</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ba15d2d8-c3fa-4ce1-a4b4-2caa991a3455</id>
      <masked>false</masked>
      <name>variable_10</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5b390932-9031-465f-88bf-d11b87b3eb85</id>
      <masked>false</masked>
      <name>variable_11</name>
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
