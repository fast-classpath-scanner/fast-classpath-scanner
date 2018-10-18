/*
 * Copyright Diffblue Limited
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.classgraph.utils;

import io.github.classgraph.utils.JarUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JarUtilsTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void smartPathSplitInputNotNullOutput0() {

    // Arrange
    final String pathStr = "";

    // Act
    final String[] retval = JarUtils.smartPathSplit(pathStr);

    // Assert result
    Assert.assertArrayEquals(new String[] {}, retval);
  }

  @Test
  public void leafNameInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final String path = "/---,,,,,";

    // Act
    final String retval = JarUtils.leafName(path);

    // Assert result
    Assert.assertEquals(",,,,,", retval);
  }

  @Test
  public void leafNameInputNotNullOutputNotNull3() throws Exception {

    // Arrange
    final String path = "-///DDDDD!";

    // Act
    final String retval = JarUtils.leafName(path);

    // Assert result
    Assert.assertEquals("DDDDD", retval);
  }
}
