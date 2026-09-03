/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation
 *
 *  See the NOTICE file(s) distributed with this work for additional
 *  information regarding copyright ownership.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/**
 * MicroProfile JWT Auth API.
 *
 * <p>
 * {@code Claims} and {@code JsonWebToken} expose {@code jakarta.json} types, {@code @Claim} is a
 * {@code jakarta.inject.Qualifier} with {@code @Nonbinding} members and {@code ClaimLiteral} extends
 * {@code AnnotationLiteral}, so the JSON-P, CDI and Inject modules are required transitively.
 */
module org.eclipse.microprofile.jwt {
    requires transitive jakarta.cdi;
    requires transitive jakarta.inject;
    requires transitive jakarta.json;

    exports org.eclipse.microprofile.auth;
    exports org.eclipse.microprofile.jwt;
    exports org.eclipse.microprofile.jwt.config;
}
