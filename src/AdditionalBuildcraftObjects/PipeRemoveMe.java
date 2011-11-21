/** 
 * Copyright (C) 2011 Flow86
 * 
 * AdditionalBuildcraftObjects is open-source.
 *
 * It is distributed under the terms of my Open Source License. 
 * It grants rights to read, modify, compile or run the code. 
 * It does *NOT* grant the right to redistribute this software or its 
 * modifications in any form, binary or source, except if expressively
 * granted by the copyright holder.
 */

package net.minecraft.src.AdditionalBuildcraftObjects;

import net.minecraft.src.buildcraft.transport.Pipe;
import net.minecraft.src.buildcraft.transport.PipeLogicGold;
import net.minecraft.src.buildcraft.transport.PipeTransportLiquids;

public class PipeRemoveMe extends Pipe {

	public PipeRemoveMe(int itemID) {
		super(new PipeTransportLiquids(), new PipeLogicGold(), itemID);
	}

	@Override
	public void initialize() {
		// remove me :)
		worldObj.setBlockAndMetadataWithNotify(xCoord, yCoord, zCoord, 0, 0);
	}
}