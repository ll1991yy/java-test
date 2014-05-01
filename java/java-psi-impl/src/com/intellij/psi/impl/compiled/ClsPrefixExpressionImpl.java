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
package com.intellij.psi.impl.compiled;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.tree.JavaElementType;
import com.intellij.psi.impl.source.tree.TreeElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class ClsPrefixExpressionImpl extends ClsElementImpl implements PsiPrefixExpression {
  private ClsElementImpl myParent;
  private final PsiJavaToken myOperation;
  private final PsiExpression myOperand;

  public ClsPrefixExpressionImpl(ClsElementImpl parent, ClsJavaTokenImpl operation, ClsLiteralExpressionImpl operand) {
    myParent = parent;
    myOperation = operation;
    myOperand = operand;
    operation.setParent(this);
    operand.setParent(this);
  }

  void setParent(ClsElementImpl parent) {
    myParent = parent;
  }

  @NotNull
  @Override
  public PsiExpression getOperand() {
    return myOperand;
  }

  @NotNull
  @Override
  public PsiJavaToken getOperationSign() {
    return myOperation;
  }

  @NotNull
  @Override
  public IElementType getOperationTokenType() {
    return myOperation.getTokenType();
  }

  @Override
  public PsiType getType() {
    return myOperand.getType();
  }

  @Override
  public PsiElement getParent() {
    return myParent;
  }

  @NotNull
  @Override
  public PsiElement[] getChildren() {
    return new PsiElement[]{myOperation, myOperand};
  }

  @Override
  public String getText() {
    return StringUtil.join(myOperation.getText(), myOperand.getText());
  }

  @Override
  public void appendMirrorText(int indentLevel, @NotNull StringBuilder buffer) {
    buffer.append(getText());
  }

  @Override
  public void setMirror(@NotNull TreeElement element) throws InvalidMirrorException {
    setMirrorCheckingType(element, JavaElementType.PREFIX_EXPRESSION);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JavaElementVisitor) {
      ((JavaElementVisitor)visitor).visitPrefixExpression(this);
    }
    else {
      visitor.visitElement(this);
    }
  }

  @Override
  public String toString() {
    return "PsiPrefixExpression:" + getText();
  }
}