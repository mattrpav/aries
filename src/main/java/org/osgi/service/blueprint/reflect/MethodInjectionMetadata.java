/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.osgi.service.blueprint.reflect;

import java.util.List;

/**
 * TODO: javadoc
 */
public interface MethodInjectionMetadata {

    /**
     * The name of the method to be invoked.
     *
     * @return the method name, overloaded methods are disambiguated by
     *         parameter specifications.
     */
    String getName();

    /**
     * The parameter specifications that determine which method to invoke
     * (in the case of overloading) and what arguments to pass to it.
     *
     * @return an array of parameter specifications, or an empty array if the
     *         method takes no arguments.
     */
    List getParameterSpecifications();

}
