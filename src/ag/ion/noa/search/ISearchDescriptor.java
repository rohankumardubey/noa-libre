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
 * Last changes made by $Author: andreas $, $Date: 2006-10-04 14:14:28 +0200 (Mi, 04 Okt 2006) $
 */
package ag.ion.noa.search;

/**
 * Descriptor of a search.
 * 
 * @author Andreas Br??ker
 * @version $Revision: 10398 $
 * @date 09.07.2006
 */ 
public interface ISearchDescriptor {
	
  //----------------------------------------------------------------------------
	/**
	 * Returns search content.
	 * 
	 * @return search content to be looked for
	 * 
	 * @author Andreas Br??ker
	 * @date 09.07.2006
	 */
	public String getSearchContent();
  //----------------------------------------------------------------------------
	/**
	 * Returns information whether the search content
	 * should be interpreted as regular expression.
	 * 
	 * @return information whether the search content
	 * should be interpreted as regular expression
	 * 
	 * @author Andreas Br??ker
	 * @date 09.07.2006
	 */
	public boolean useRegularExpression();
  //----------------------------------------------------------------------------
	/**
	 * Returns information whether the search content
	 * is case sensitive.
	 * 
	 * @return information whether the search content
	 * is case sensitive
	 * 
	 * @author Andreas Br??ker
	 * @date 09.07.2006
	 */
	public boolean isCaseSensitive();
  //----------------------------------------------------------------------------
	/**
	 * Returns information whether only complete words
	 * should be searched.
	 * 
	 * @return information whether only complete words
	 * should be searched
	 * 
	 * @author Andreas Br??ker
	 * @date 09.07.2006
	 */
	public boolean useCompleteWords();
  //----------------------------------------------------------------------------
	/**
	 * Returns information whether a similarity search 
	 * should be done.
	 * 
	 * @return information whether a similarity search 
	 * should be done
	 * 
	 * @author Andreas Br??ker
	 * @date 13.07.2006
	 */
	public boolean useSimilaritySearch();	
  //----------------------------------------------------------------------------
	
}