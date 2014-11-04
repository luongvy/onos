/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.onos.store.serializers;

import java.nio.ByteBuffer;

// TODO: To be replaced with SerializationService from IOLoop activity
/**
 * Service to serialize Objects into byte array.
 */
public interface StoreSerializer {

    /**
     * Serializes the specified object into bytes.
     *
     * @param obj object to be serialized
     * @return serialized bytes
     */
    public byte[] encode(final Object obj);

    /**
     * Serializes the specified object into bytes.
     *
     * @param obj object to be serialized
     * @param buffer to write serialized bytes
     */
    public void encode(final Object obj, ByteBuffer buffer);

    /**
     * Deserializes the specified bytes into an object.
     *
     * @param bytes bytes to be deserialized
     * @return deserialized object
     * @param <T> decoded type
     */
    public <T> T decode(final byte[] bytes);

    /**
     * Deserializes the specified bytes into an object.
     *
     * @param buffer bytes to be deserialized
     * @return deserialized object
     * @param <T> decoded type
     */
    public <T> T decode(final ByteBuffer buffer);
}
