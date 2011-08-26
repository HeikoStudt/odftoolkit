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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.attribute.style.StyleWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleRelWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableAlignAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginLeftAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginRightAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginTopAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginBottomAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePageNumberAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoBreakBeforeAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoBreakAfterAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoBackgroundColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleShadowAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoKeepWithNextAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleMayBreakBetweenRowsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableBorderModelAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleWritingModeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDisplayAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeBinaryDataElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:table-properties}.
 *
 */
public class StyleTablePropertiesElement extends OdfStylePropertiesBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "table-properties" );


	/**
	 * Create the instance of <code>StyleTablePropertiesElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleTablePropertiesElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:table-properties}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

    public final static OdfStyleProperty Width = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "width"));
    public final static OdfStyleProperty RelWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "rel-width"));
    public final static OdfStyleProperty Align = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.TABLE, "align"));
    public final static OdfStyleProperty MarginLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-left"));
    public final static OdfStyleProperty MarginRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-right"));
    public final static OdfStyleProperty MarginTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-top"));
    public final static OdfStyleProperty MarginBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-bottom"));
    public final static OdfStyleProperty Margin = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "margin"));
    public final static OdfStyleProperty PageNumber = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "page-number"));
    public final static OdfStyleProperty BreakBefore = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "break-before"));
    public final static OdfStyleProperty BreakAfter = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "break-after"));
    public final static OdfStyleProperty BackgroundColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "background-color"));
    public final static OdfStyleProperty Shadow = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "shadow"));
    public final static OdfStyleProperty KeepWithNext = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.FO, "keep-with-next"));
    public final static OdfStyleProperty MayBreakBetweenRows = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "may-break-between-rows"));
    public final static OdfStyleProperty BorderModel = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.TABLE, "border-model"));
    public final static OdfStyleProperty WritingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.STYLE, "writing-mode"));
    public final static OdfStyleProperty Display = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.newName(OdfNamespaceNames.TABLE, "display"));


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleWidthAttribute</code> , See {@odf.attribute style:width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleWidthAttribute()
	{
		StyleWidthAttribute attr = (StyleWidthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "width" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleWidthAttribute</code> , See {@odf.attribute style:width}
	 *
	 * @param styleWidthValue   The type is <code>String</code>
	 */
	public void setStyleWidthAttribute( String styleWidthValue )
	{
		StyleWidthAttribute attr =  new StyleWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleRelWidthAttribute</code> , See {@odf.attribute style:rel-width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleRelWidthAttribute()
	{
		StyleRelWidthAttribute attr = (StyleRelWidthAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "rel-width" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleRelWidthAttribute</code> , See {@odf.attribute style:rel-width}
	 *
	 * @param styleRelWidthValue   The type is <code>String</code>
	 */
	public void setStyleRelWidthAttribute( String styleRelWidthValue )
	{
		StyleRelWidthAttribute attr =  new StyleRelWidthAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleRelWidthValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableAlignAttribute</code> , See {@odf.attribute table:align}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableAlignAttribute()
	{
		TableAlignAttribute attr = (TableAlignAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "align" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableAlignAttribute</code> , See {@odf.attribute table:align}
	 *
	 * @param tableAlignValue   The type is <code>String</code>
	 */
	public void setTableAlignAttribute( String tableAlignValue )
	{
		TableAlignAttribute attr =  new TableAlignAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableAlignValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginLeftAttribute()
	{
		FoMarginLeftAttribute attr = (FoMarginLeftAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-left" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @param foMarginLeftValue   The type is <code>String</code>
	 */
	public void setFoMarginLeftAttribute( String foMarginLeftValue )
	{
		FoMarginLeftAttribute attr =  new FoMarginLeftAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginLeftValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginRightAttribute</code> , See {@odf.attribute fo:margin-right}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginRightAttribute()
	{
		FoMarginRightAttribute attr = (FoMarginRightAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-right" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginRightAttribute</code> , See {@odf.attribute fo:margin-right}
	 *
	 * @param foMarginRightValue   The type is <code>String</code>
	 */
	public void setFoMarginRightAttribute( String foMarginRightValue )
	{
		FoMarginRightAttribute attr =  new FoMarginRightAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginRightValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginTopAttribute</code> , See {@odf.attribute fo:margin-top}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginTopAttribute()
	{
		FoMarginTopAttribute attr = (FoMarginTopAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-top" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginTopAttribute</code> , See {@odf.attribute fo:margin-top}
	 *
	 * @param foMarginTopValue   The type is <code>String</code>
	 */
	public void setFoMarginTopAttribute( String foMarginTopValue )
	{
		FoMarginTopAttribute attr =  new FoMarginTopAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginTopValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginBottomAttribute</code> , See {@odf.attribute fo:margin-bottom}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginBottomAttribute()
	{
		FoMarginBottomAttribute attr = (FoMarginBottomAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-bottom" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginBottomAttribute</code> , See {@odf.attribute fo:margin-bottom}
	 *
	 * @param foMarginBottomValue   The type is <code>String</code>
	 */
	public void setFoMarginBottomAttribute( String foMarginBottomValue )
	{
		FoMarginBottomAttribute attr =  new FoMarginBottomAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginBottomValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginAttribute</code> , See {@odf.attribute fo:margin}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginAttribute()
	{
		FoMarginAttribute attr = (FoMarginAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginAttribute</code> , See {@odf.attribute fo:margin}
	 *
	 * @param foMarginValue   The type is <code>String</code>
	 */
	public void setFoMarginAttribute( String foMarginValue )
	{
		FoMarginAttribute attr =  new FoMarginAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePageNumberAttribute</code> , See {@odf.attribute style:page-number}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePageNumberAttribute()
	{
		StylePageNumberAttribute attr = (StylePageNumberAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "page-number" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePageNumberAttribute</code> , See {@odf.attribute style:page-number}
	 *
	 * @param stylePageNumberValue   The type is <code>String</code>
	 */
	public void setStylePageNumberAttribute( String stylePageNumberValue )
	{
		StylePageNumberAttribute attr =  new StylePageNumberAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePageNumberValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoBreakBeforeAttribute</code> , See {@odf.attribute fo:break-before}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoBreakBeforeAttribute()
	{
		FoBreakBeforeAttribute attr = (FoBreakBeforeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "break-before" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoBreakBeforeAttribute</code> , See {@odf.attribute fo:break-before}
	 *
	 * @param foBreakBeforeValue   The type is <code>String</code>
	 */
	public void setFoBreakBeforeAttribute( String foBreakBeforeValue )
	{
		FoBreakBeforeAttribute attr =  new FoBreakBeforeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foBreakBeforeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoBreakAfterAttribute</code> , See {@odf.attribute fo:break-after}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoBreakAfterAttribute()
	{
		FoBreakAfterAttribute attr = (FoBreakAfterAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "break-after" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoBreakAfterAttribute</code> , See {@odf.attribute fo:break-after}
	 *
	 * @param foBreakAfterValue   The type is <code>String</code>
	 */
	public void setFoBreakAfterAttribute( String foBreakAfterValue )
	{
		FoBreakAfterAttribute attr =  new FoBreakAfterAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foBreakAfterValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoBackgroundColorAttribute</code> , See {@odf.attribute fo:background-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoBackgroundColorAttribute()
	{
		FoBackgroundColorAttribute attr = (FoBackgroundColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "background-color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoBackgroundColorAttribute</code> , See {@odf.attribute fo:background-color}
	 *
	 * @param foBackgroundColorValue   The type is <code>String</code>
	 */
	public void setFoBackgroundColorAttribute( String foBackgroundColorValue )
	{
		FoBackgroundColorAttribute attr =  new FoBackgroundColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foBackgroundColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleShadowAttribute</code> , See {@odf.attribute style:shadow}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleShadowAttribute()
	{
		StyleShadowAttribute attr = (StyleShadowAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "shadow" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleShadowAttribute</code> , See {@odf.attribute style:shadow}
	 *
	 * @param styleShadowValue   The type is <code>String</code>
	 */
	public void setStyleShadowAttribute( String styleShadowValue )
	{
		StyleShadowAttribute attr =  new StyleShadowAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleShadowValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoKeepWithNextAttribute</code> , See {@odf.attribute fo:keep-with-next}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoKeepWithNextAttribute()
	{
		FoKeepWithNextAttribute attr = (FoKeepWithNextAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "keep-with-next" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoKeepWithNextAttribute</code> , See {@odf.attribute fo:keep-with-next}
	 *
	 * @param foKeepWithNextValue   The type is <code>String</code>
	 */
	public void setFoKeepWithNextAttribute( String foKeepWithNextValue )
	{
		FoKeepWithNextAttribute attr =  new FoKeepWithNextAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foKeepWithNextValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleMayBreakBetweenRowsAttribute</code> , See {@odf.attribute style:may-break-between-rows}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleMayBreakBetweenRowsAttribute()
	{
		StyleMayBreakBetweenRowsAttribute attr = (StyleMayBreakBetweenRowsAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "may-break-between-rows" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleMayBreakBetweenRowsAttribute</code> , See {@odf.attribute style:may-break-between-rows}
	 *
	 * @param styleMayBreakBetweenRowsValue   The type is <code>Boolean</code>
	 */
	public void setStyleMayBreakBetweenRowsAttribute( Boolean styleMayBreakBetweenRowsValue )
	{
		StyleMayBreakBetweenRowsAttribute attr =  new StyleMayBreakBetweenRowsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleMayBreakBetweenRowsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBorderModelAttribute</code> , See {@odf.attribute table:border-model}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableBorderModelAttribute()
	{
		TableBorderModelAttribute attr = (TableBorderModelAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "border-model" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBorderModelAttribute</code> , See {@odf.attribute table:border-model}
	 *
	 * @param tableBorderModelValue   The type is <code>String</code>
	 */
	public void setTableBorderModelAttribute( String tableBorderModelValue )
	{
		TableBorderModelAttribute attr =  new TableBorderModelAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableBorderModelValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleWritingModeAttribute</code> , See {@odf.attribute style:writing-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleWritingModeAttribute()
	{
		StyleWritingModeAttribute attr = (StyleWritingModeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "writing-mode" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleWritingModeAttribute</code> , See {@odf.attribute style:writing-mode}
	 *
	 * @param styleWritingModeValue   The type is <code>String</code>
	 */
	public void setStyleWritingModeAttribute( String styleWritingModeValue )
	{
		StyleWritingModeAttribute attr =  new StyleWritingModeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleWritingModeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDisplayAttribute</code> , See {@odf.attribute table:display}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableDisplayAttribute()
	{
		TableDisplayAttribute attr = (TableDisplayAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "display" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDisplayAttribute</code> , See {@odf.attribute table:display}
	 *
	 * @param tableDisplayValue   The type is <code>Boolean</code>
	 */
	public void setTableDisplayAttribute( Boolean tableDisplayValue )
	{
		TableDisplayAttribute attr =  new TableDisplayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableDisplayValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element office:binary-data}.
	 *
	 * @return   return  the element {@odf.element office:binary-data}
	 * DifferentQName 
	 */
	public OfficeBinaryDataElement newOfficeBinaryDataElement()
	{
		OfficeBinaryDataElement  officeBinaryData = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeBinaryDataElement.class);
		this.appendChild( officeBinaryData);
		return  officeBinaryData;
	}                   
               
}
