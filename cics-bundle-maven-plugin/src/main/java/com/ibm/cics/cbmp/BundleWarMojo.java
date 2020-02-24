package com.ibm.cics.cbmp;

/*-
 * #%L
 * CICS Bundle Maven Plugin
 * %%
 * Copyright (C) 2019 IBM Corp.
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * <p>This mojo packages the produced WAR project as a CICS bundle.</p>
 * <p>Use this mojo to add configuration to an existing WAR project so that it is packaged as a CICS bundle, without creating an additional Maven module.</p>
 */
@Mojo(name = "bundle-war", requiresDependencyResolution = ResolutionScope.TEST, defaultPhase = LifecyclePhase.VERIFY)
public class BundleWarMojo extends AbstractBundleJavaMojo {
	
	@Override
	protected AbstractJavaBundlePartBinding getBundlePartBinding() {
		return new Warbundle();
	}

}
