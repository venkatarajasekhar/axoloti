/**
 * Copyright (C) 2013, 2014 Johannes Taelman
 *
 * This file is part of Axoloti.
 *
 * Axoloti is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Axoloti is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Axoloti. If not, see <http://www.gnu.org/licenses/>.
 */
package displays;

import axoloti.datatypes.Value;
import axoloti.datatypes.ValueFrac32;
import components.displays.VUComponent;

/**
 *
 * @author Johannes Taelman
 */
public class DisplayInstanceFrac32VU extends DisplayInstance1 {

    ValueFrac32 value = new ValueFrac32();

    @Override
    public Value getValueRef() {
        return value;
    }

    private VUComponent vu;

    public DisplayInstanceFrac32VU() {
    }

    @Override
    public void PostConstructor() {
        super.PostConstructor();

        vu = new VUComponent();
        vu.setValue(0);
        add(vu);
    }

    @Override
    public void updateV() {
        vu.setValue(value.getDouble());
    }
}