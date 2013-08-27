package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class BlockVineaFabricator extends BlockVineacraft {
	
	
	public BlockVineaFabricator(int id){
		
		
		super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_FABRICATOR_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setHardness(5F);	
		
	
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
