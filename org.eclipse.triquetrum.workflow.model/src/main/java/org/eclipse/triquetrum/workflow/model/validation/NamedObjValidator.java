/*******************************************************************************
 * Copyright (c) 2015 iSencia Belgium NV.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Erwin De Ley - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.triquetrum.workflow.model.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.triquetrum.workflow.model.Attribute;
import org.eclipse.triquetrum.workflow.model.NamedObj;

/**
 * A sample validator interface for {@link org.eclipse.triquetrum.workflow.model.NamedObj}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NamedObjValidator {
  boolean validate();

  boolean validateName(String value);
  boolean validateAttributes(EList<Attribute> value);
  boolean validateWrappedType(String value);

  boolean validateWrappedObject(ptolemy.kernel.util.NamedObj value);

  boolean validateDeepComplete(boolean value);

  boolean validateContainer(NamedObj value);
}
