/****************************************************************************
 *                                                                          *
 * NOA (Nice Office Access)                                     						*
 * ------------------------------------------------------------------------ *
 *                                                                          *
 * The Contents of this file are made available subject to                  *
 * the terms of GNU Lesser General Public License Version 2.1.              *
 *                                                                          * 
 * GNU Lesser General Public License Version 2.1                            *
 * ======================================================================== *
 * Copyright 2003-2006 by IOn AG                                            *
 *                                                                          *
 * This library is free software; you can redistribute it and/or            *
 * modify it under the terms of the GNU Lesser General Public               *
 * License version 2.1, as published by the Free Software Foundation.       *
 *                                                                          *
 * This library is distributed in the hope that it will be useful,          *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of           *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU        *
 * Lesser General Public License for more details.                          *
 *                                                                          *
 * You should have received a copy of the GNU Lesser General Public         *
 * License along with this library; if not, write to the Free Software      *
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,                    *
 * MA  02111-1307  USA                                                      *
 *                                                                          *
 * Contact us:                                                              *
 *  http://www.ion.ag																												*
 *  http://ubion.ion.ag                                                     *
 *  info@ion.ag                                                             *
 *                                                                          *
 ****************************************************************************/
 
/*
 * Last changes made by $Author: markus $, $Date: 2008-03-13 07:36:47 +0100 (Do, 13 Mrz 2008) $
 */
package ag.ion.noa.filter;

import ag.ion.bion.officelayer.document.IDocument;

import ag.ion.bion.officelayer.filter.IFilter;

/**
 * Filter for the StarWriter 3.0 Template format.
 * 
 * @author Andreas Br??ker
 * @version $Revision: 11619 $
 * @date 09.07.2006
 */ 
public class StarOffice30TemplateFilter extends AbstractFilter implements IFilter {
	
	/** Global filter for StarWriter 3.0 Template.*/
	public static final IFilter FILTER = new StarOffice30TemplateFilter();
	
  //----------------------------------------------------------------------------
	/**
   * Returns definition of the filter. Returns null if the filter
   * is not available for the submitted document type.
   * 
   * @param documentType document type to be used
   * 
   * @return definition of the filter or null if the filter
   * is not available for the submitted document type
   * 
   * @author Markus Kr??ger
   * @date 13.03.2008
   */
  public String getFilterDefinition(String documentType) {
    if(documentType.equals(IDocument.WRITER)) {
      return "StarWriter 3.0 Vorlage/Template";
    }
    if(documentType.equals(IDocument.CALC)) {
      return "StarCalc 3.0 Vorlage/Template";
    }
    if(documentType.equals(IDocument.DRAW)) {
      return "StarDraw 3.0 Vorlage";
    }
    return null;
  }
	//----------------------------------------------------------------------------
  /**
   * Returns file extension of the filter. Returns null
   * if the document type is not supported by the filter.
   * 
   * @param documentType document type to be used
   * 
   * @return file extension of the filter
   * 
   * @author Markus Kr??ger
   * @date 03.04.2007
   */
  public String getFileExtension(String documentType) {
    if(documentType == null)
      return null;
    if(documentType.equals(IDocument.WRITER)) {
      return "vor";
    }
    if(documentType.equals(IDocument.CALC)) {
      return "vor";
    }
    if(documentType.equals(IDocument.DRAW)) {
      return "vor";
    }
    return null;
  } 
  //----------------------------------------------------------------------------
  /**
   * Returns name of the filter. Returns null
   * if the submitted document type is not supported by the filter.
   * 
   * @param documentType document type to be used
   * 
   * @return name of the filter
   * 
   * @author Markus Kr??ger
   * @date 13.03.2008
   */
  public String getName(String documentType) {
		if(documentType.equals(IDocument.WRITER)) {
      return "StarWriter 3.0 Template";
    }
		else if(documentType.equals(IDocument.CALC)) {
      return "StarCalc 3.0 Template";
    }
		else if(documentType.equals(IDocument.DRAW)) {
      return "StarDraw 3.0 Template";
    }
    else {
      return null;
    }
	}
	//----------------------------------------------------------------------------
	
}