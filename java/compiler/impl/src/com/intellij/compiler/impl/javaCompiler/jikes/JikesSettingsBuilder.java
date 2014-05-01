/*
 * Copyright 2000-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.compiler.impl.javaCompiler.jikes;

import com.intellij.compiler.impl.javaCompiler.javac.JavacSettingsBuilder;
import com.intellij.openapi.module.Module;
import com.intellij.util.Chunk;
import org.jetbrains.jps.model.java.compiler.JikesCompilerOptions;

import java.util.Collection;

public class JikesSettingsBuilder extends JavacSettingsBuilder {

  public JikesSettingsBuilder(JikesCompilerOptions options) {
    super(options);
  }

  @Override
  public JikesCompilerOptions getOptions() {
    return (JikesCompilerOptions)super.getOptions();
  }

  public Collection<String> getOptions(Chunk<Module> chunk) {
    final Collection<String> options = super.getOptions(chunk);
    if(getOptions().IS_EMACS_ERRORS_MODE) {
      options.add("+E");
    }
    return options;
  }

  protected boolean acceptUserOption(String token) {
    if (!super.acceptUserOption(token)) {
      return false;
    }
    return !("++".equals(token) || "+M".equals(token) || "+F".equals(token) || "+E".equals(token));
  }
}