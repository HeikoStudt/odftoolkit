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

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:generic-control}.
 *
 */
public class FormGenericControlElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.FORM, "generic-control" );


	/**
	 * Create the instance of <code>FormGenericControlElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormGenericControlElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:generic-control}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  FormGenericControlElement}
	 *
     * @param formIdAttributeValue  The mandatory attribute {@odf.attribute  form:id}"
     * @param xmlIdAttributeValue  The mandatory attribute {@odf.attribute  xml:id}"
     *
	 */
	public void init(String formIdAttributeValue, String xmlIdAttributeValue)
	{
		setFormIdAttribute( formIdAttributeValue );
		setXmlIdAttribute( xmlIdAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormNameAttribute()
	{
		FormNameAttribute attr = (FormNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @param formNameValue   The type is <code>String</code>
	 */
	public void setFormNameAttribute( String formNameValue )
	{
		FormNameAttribute attr =  new FormNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormControlImplementationAttribute()
	{
		FormControlImplementationAttribute attr = (FormControlImplementationAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "control-implementation" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @param formControlImplementationValue   The type is <code>String</code>
	 */
	public void setFormControlImplementationAttribute( String formControlImplementationValue )
	{
		FormControlImplementationAttribute attr =  new FormControlImplementationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formControlImplementationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormIdAttribute()
	{
		FormIdAttribute attr = (FormIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @param formIdValue   The type is <code>String</code>
	 */
	public void setFormIdAttribute( String formIdValue )
	{
		FormIdAttribute attr =  new FormIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXformsBindAttribute()
	{
		XformsBindAttribute attr = (XformsBindAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XFORMS), "bind" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @param xformsBindValue   The type is <code>String</code>
	 */
	public void setXformsBindAttribute( String xformsBindValue )
	{
		XformsBindAttribute attr =  new XformsBindAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xformsBindValue );
	}

	/**
	 * Create child element {@odf.element form:properties}.
	 *
	 * @return   return  the element {@odf.element form:properties}
	 * DifferentQName 
	 */
	public FormPropertiesElement newFormPropertiesElement()
	{
		FormPropertiesElement  formProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(FormPropertiesElement.class);
		this.appendChild( formProperties);
		return  formProperties;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
}
