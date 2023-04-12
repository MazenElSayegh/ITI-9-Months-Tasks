<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
<xsl:output method="html"/>
<xsl:template match="/">

    <html>
      <head>
        <title>Employees</title>
      </head>
      <body>
        <h1 align="center">Employees</h1>
        <table align="center">
          <tr align="center" style="background:lightgreen; color:black;">
            <th rowspan="2">Name</th>
            <th rowspan="2">Email</th>
            <th rowspan="2">Phones</th>
            <th colspan="5">Addresses</th>
          </tr>
          <tr align="center" style="background:aliceblue; color:black;">
			<th>Country</th>
			<th>City</th>
			<th>Region</th>
			<th>Buliding Number</th>
			<th>Street</th>
		  </tr>
          <xsl:for-each select="employees/employee">
            <tr align="center" style="background:lightyellow; color:darkgrey;">
              <td><xsl:value-of select="name" /></td>
              <td><xsl:value-of select="email" /></td>
              <td><xsl:value-of select="phones/phone" /></td>
              <td><xsl:value-of select="addresses/address/street"/></td>
		  <td><xsl:value-of select="addresses/address/buildingNumber"/></td>
		  <td><xsl:value-of select="addresses/address/Region"/></td>
              <td><xsl:value-of select="addresses/address/city"/></td>
	        <td><xsl:value-of select="addresses/address/country"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
