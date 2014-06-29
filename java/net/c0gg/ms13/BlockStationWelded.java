package net.c0gg.ms13;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockStationWelded extends BlockStation implements ToolableWelder {
	public BlockStationWelded(int par1) {
		
		super(par1);
	}
	private Block StationFree = ModMinestation.blockStationBlockFree;
	@Override
	public void onUseWelder(World world, int x, int y, int z, int dir) {
		world.setBlock(x, y, z, StationFree);
	}
}
