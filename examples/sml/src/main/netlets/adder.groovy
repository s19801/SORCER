#!/usr/bin/env nsh
/*
 * Copyright to the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

codebase artifact:org.sorcer/arithmetic/jar/dl/5.2.0

import sorcer.arithmetic.provider.Adder

import static sorcer.co.operator.inEnt
import static sorcer.eo.operator.*

Double v1 = 100.0;
Double v2 = 200.0;

task("hello adder", sig("add", Adder.class),
        context("adder", inEnt("arg/x1", v1), inEnt("arg/x2", v2), result("out/y")));


