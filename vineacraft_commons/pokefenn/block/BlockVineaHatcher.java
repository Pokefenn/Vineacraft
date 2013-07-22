package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class BlockVineaHatcher extends BlockVineacraft {
    
    public BlockVineaHatcher(int id){
        
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_HATCHER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        // TODO Auto-generated method stub
        return null;
    }
    }


