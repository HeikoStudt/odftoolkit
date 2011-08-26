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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableFunctionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableSourceCellRangeAddressesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTargetCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseLabelsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableLinkToSourceDataAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:consolidation}.
 *
 */
public class TableConsolidationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "consolidation" );


	/**
	 * Create the instance of <code>TableConsolidationElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableConsolidationElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:consolidation}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableConsolidationElement}
	 *
     * @param tableFunctionAttributeValue  The mandatory attribute {@odf.attribute  table:function}"
     * @param tableSourceCellRangeAddressesAttributeValue  The mandatory attribute {@odf.attribute  table:source-cell-range-addresses}"
     * @param tableTargetCellAddressAttributeValue  The mandatory attribute {@odf.attribute  table:target-cell-address}"
     *
	 */
	public void init(String tableFunctionAttributeValue, String tableSourceCellRangeAddressesAttributeValue, String tableTargetCellAddressAttributeValue)
	{
		setTableFunctionAttribute( tableFunctionAttributeValue );
		setTableSourceCellRangeAddressesAttribute( tableSourceCellRangeAddressesAttributeValue );
		setTableTargetCellAddressAttribute( tableTargetCellAddressAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFunctionAttribute()
	{
		TableFunctionAttribute attr = (TableFunctionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "function" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFunctionAttribute</code> , See {@odf.attribute table:function}
	 *
	 * @param tableFunctionValue   The type is <code>String</code>
	 */
	public void setTableFunctionAttribute( String tableFunctionValue )
	{
		TableFunctionAttribute attr =  new TableFunctionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableFunctionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSourceCellRangeAddressesAttribute</code> , See {@odf.attribute table:source-cell-range-addresses}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSourceCellRangeAddressesAttribute()
	{
		TableSourceCellRangeAddressesAttribute attr = (TableSourceCellRangeAddressesAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "source-cell-range-addresses" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSourceCellRangeAddressesAttribute</code> , See {@odf.attribute table:source-cell-range-addresses}
	 *
	 * @param tableSourceCellRangeAddressesValue   The type is <code>String</code>
	 */
	public void setTableSourceCellRangeAddressesAttribute( String tableSourceCellRangeAddressesValue )
	{
		TableSourceCellRangeAddressesAttribute attr =  new TableSourceCellRangeAddressesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableSourceCellRangeAddressesValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTargetCellAddressAttribute</code> , See {@odf.attribute table:target-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTargetCellAddressAttribute()
	{
		TableTargetCellAddressAttribute attr = (TableTargetCellAddressAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "target-cell-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTargetCellAddressAttribute</code> , See {@odf.attribute table:target-cell-address}
	 *
	 * @param tableTargetCellAddressValue   The type is <code>String</code>
	 */
	public void setTableTargetCellAddressAttribute( String tableTargetCellAddressValue )
	{
		TableTargetCellAddressAttribute attr =  new TableTargetCellAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableTargetCellAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseLabelsAttribute</code> , See {@odf.attribute table:use-labels}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableUseLabelsAttribute()
	{
		TableUseLabelsAttribute attr = (TableUseLabelsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "use-labels" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableUseLabelsAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseLabelsAttribute</code> , See {@odf.attribute table:use-labels}
	 *
	 * @param tableUseLabelsValue   The type is <code>String</code>
	 */
	public void setTableUseLabelsAttribute( String tableUseLabelsValue )
	{
		TableUseLabelsAttribute attr =  new TableUseLabelsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableUseLabelsValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableLinkToSourceDataAttribute</code> , See {@odf.attribute table:link-to-source-data}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableLinkToSourceDataAttribute()
	{
		TableLinkToSourceDataAttribute attr = (TableLinkToSourceDataAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "link-to-source-data" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableLinkToSourceDataAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableLinkToSourceDataAttribute</code> , See {@odf.attribute table:link-to-source-data}
	 *
	 * @param tableLinkToSourceDataValue   The type is <code>Boolean</code>
	 */
	public void setTableLinkToSourceDataAttribute( Boolean tableLinkToSourceDataValue )
	{
		TableLinkToSourceDataAttribute attr =  new TableLinkToSourceDataAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableLinkToSourceDataValue.booleanValue() );
	}

}
