<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Document</name>
   <tag></tag>
   <elementGuidId>75359deb-821f-4aba-a00a-1fdc28797677</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;encodedContent\&quot;:\&quot;${encodedContent}\&quot;,\n  \&quot;contentType\&quot;:\&quot;${contentType}\&quot;,\n  \&quot;contentName\&quot;:\&quot;${contentName}\&quot;,\n  \&quot;tags\&quot;:[]\n}&quot;,
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
   <restUrl>https://cubedev.ccnexchange.com/00d61ecde27c9c4aee788d1c57ff2948/document</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'000011,0001234,0011345,0001143'</defaultValue>
      <description></description>
      <id>07e52f87-e581-4d9d-b57a-11d28330b3e9</id>
      <masked>false</masked>
      <name>encodedContent</name>
   </variables>
   <variables>
      <defaultValue>'Test_ContentType3'</defaultValue>
      <description></description>
      <id>ea8d0d56-b7c6-4d27-a152-7d9f29710b63</id>
      <masked>false</masked>
      <name>contentType</name>
   </variables>
   <variables>
      <defaultValue>'Test_UPD'</defaultValue>
      <description></description>
      <id>7b257484-c67c-44e5-89c9-8e0311eabf31</id>
      <masked>false</masked>
      <name>contentName</name>
   </variables>
   <variables>
      <defaultValue>'[]'</defaultValue>
      <description></description>
      <id>333e8fec-620d-4e08-a0f2-3c55c566dd20</id>
      <masked>false</masked>
      <name>tags</name>
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
