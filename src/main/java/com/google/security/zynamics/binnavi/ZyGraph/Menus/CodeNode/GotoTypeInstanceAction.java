// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.ZyGraph.Menus.CodeNode;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree.Nodes.Module.Component.CModuleNodeComponent;
import com.google.security.zynamics.binnavi.disassembly.types.TypeInstance;

public class GotoTypeInstanceAction extends AbstractAction {

  private final TypeInstance instance;

  public GotoTypeInstanceAction(TypeInstance instance) {
    super("Goto type instance");
    this.instance = instance;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    CModuleNodeComponent.focusTypeInstance(instance.getModule(), instance);
  }
}