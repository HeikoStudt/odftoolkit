/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:database-description}.
 *
 */
public class DbDatabaseDescriptionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DB, "database-description" );


	/**
	 * Create the instance of <code>DbDatabaseDescriptionElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbDatabaseDescriptionElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:database-description}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element db:file-based-database}.
	 *
     * @param dbMediaTypeAttributeValue  the <code>String</code> value of <code>DbMediaTypeAttribute</code>, see {@odf.attribute  db:media-type} at specification
	 * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element db:file-based-database}
	 * DifferentQName 
	 */
    
	public DbFileBasedDatabaseElement newDbFileBasedDatabaseElement(String dbMediaTypeAttributeValue, String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		DbFileBasedDatabaseElement  dbFileBasedDatabase = ((OdfFileDom)this.ownerDocument).newOdfElement(DbFileBasedDatabaseElement.class);
		dbFileBasedDatabase.setDbMediaTypeAttribute( dbMediaTypeAttributeValue );
		dbFileBasedDatabase.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		dbFileBasedDatabase.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( dbFileBasedDatabase);
		return  dbFileBasedDatabase;      
	}
    
	/**
	 * Create child element {@odf.element db:server-database}.
	 *
     * @param dbTypeAttributeValue  the <code>String</code> value of <code>DbTypeAttribute</code>, see {@odf.attribute  db:type} at specification
	 * @return   return  the element {@odf.element db:server-database}
	 * DifferentQName 
	 */
    
	public DbServerDatabaseElement newDbServerDatabaseElement(String dbTypeAttributeValue)
	{
		DbServerDatabaseElement  dbServerDatabase = ((OdfFileDom)this.ownerDocument).newOdfElement(DbServerDatabaseElement.class);
		dbServerDatabase.setDbTypeAttribute( dbTypeAttributeValue );
		this.appendChild( dbServerDatabase);
		return  dbServerDatabase;      
	}
    
}
