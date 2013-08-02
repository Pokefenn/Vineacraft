package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.tileentity.TileManualSqueezer;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;



public class BlockManualSqueezer extends BlockVineacraft {

    public BlockManualSqueezer(int id) {
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.MANUAL_SQUEEZER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
    }
    
    
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileManualSqueezer();
    }

    
    
    
    
}
