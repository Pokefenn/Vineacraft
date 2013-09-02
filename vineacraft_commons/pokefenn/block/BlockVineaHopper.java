package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;

public class BlockVineaHopper extends BlockVineacraft {
	
	
	
	public BlockVineaHopper(int id){
		
		super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_HOPPER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		
		return null;
	}

}
