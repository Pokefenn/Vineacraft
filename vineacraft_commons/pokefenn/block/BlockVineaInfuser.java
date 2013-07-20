package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockVineaInfuser extends BlockVineacraft {

    public BlockVineaInfuser(int id){
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_INFUSER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
    }
    
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
