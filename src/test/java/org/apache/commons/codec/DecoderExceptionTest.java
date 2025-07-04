/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link DecoderException}.
 */
class DecoderExceptionTest {

    private static final String MSG = "TEST";

    private static final Throwable t = new Exception();

    @Test
    void testConstructor0() {
        final DecoderException e = new DecoderException();
        assertNull(e.getMessage());
        assertNull(e.getCause());
    }

    @Test
    void testConstructorString() {
        final DecoderException e = new DecoderException(MSG);
        assertEquals(MSG, e.getMessage());
        assertNull(e.getCause());
    }

    @Test
    void testConstructorStringThrowable() {
        final DecoderException e = new DecoderException(MSG, t);
        assertEquals(MSG, e.getMessage());
        assertEquals(t, e.getCause());
    }

    @Test
    void testConstructorThrowable() {
        final DecoderException e = new DecoderException(t);
        assertEquals(t.getClass().getName(), e.getMessage());
        assertEquals(t, e.getCause());
    }

}
