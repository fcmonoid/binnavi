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

package com.google.security.zynamics.binnavi.ZyGraph.Updaters.GroupNodes;

import com.google.security.zynamics.binnavi.Gui.GraphWindows.CGraphModel;
import com.google.security.zynamics.binnavi.ZyGraph.Updaters.INodeUpdater;
import com.google.security.zynamics.binnavi.disassembly.INaviGroupNode;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.NaviNode;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.Updaters.GroupNodes.CGroupNodeUpdater;

/**
 * Factory class to create group node updaters.
 */
public final class CGroupNodeUpdaterCreator implements INodeUpdater {
  @Override
  public void visit(final CGraphModel model, final NaviNode node) {
    if (node.getRawNode() instanceof INaviGroupNode) {
      node.getRealizer().setUpdater(
          new CGroupNodeUpdater(model.getGraph(), (INaviGroupNode) node.getRawNode()));
    }
  }
}
