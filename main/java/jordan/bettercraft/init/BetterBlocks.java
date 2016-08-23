package jordan.bettercraft.init;


import jordan.bettercraft.init.blocks.CraftingAltar;
import jordan.bettercraft.init.blocks.decoration.CookieJar;
import jordan.bettercraft.init.blocks.decoration.chairs.BlockChair;
import jordan.bettercraft.init.blocks.furnaces.QuartzFurnace;
import jordan.bettercraft.init.blocks.ores.Bauxite;
import jordan.bettercraft.init.blocks.ores.CopperOre;
import jordan.bettercraft.init.blocks.ores.RubyOre;
import jordan.bettercraft.init.blocks.ores.SapphireOre;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterBlocks 
{
	//Ores
	public static Block RUBY_ORE;
	public static Block SAPPHIRE_ORE;
	public static Block COPPER_ORE;
	public static Block ALLUMINUM_ORE;
	//Normal Blocks
		
		
	//Stairs
	
	//Fence Gates
		
	//Other
	public static Block ALTAR;
	
	//Furnace
	public static Block QUARTZ_FURNACE;
	public static Block LIT_QUARTZ_FURNACE;
	
	//CraftingTables
	public static Block ADVANCED_CRAFTING_TABLE;
	
	//Chairs
	public static Block WOODEN_CHAIR;
	public static Block SPRUCE_WOODEN_CHAIR;
	
	//DecoBlocks
	public static Block COOKIE_JAR;
	
	public static void init()
	{
		//Ores
		RUBY_ORE = new RubyOre();
		SAPPHIRE_ORE = new SapphireOre();
		COPPER_ORE = new CopperOre();
		ALLUMINUM_ORE = new Bauxite();
		
		//NormalBlocks
		
		//Stairs
		
		//FenceGates
		
		//Other
		ALTAR = new CraftingAltar();
	
		
		//Furnace
		QUARTZ_FURNACE = new QuartzFurnace(false, "quartz_furnace");
		LIT_QUARTZ_FURNACE = new QuartzFurnace(true, "lit_quartz_furnace");
		
		//CraftingTables
		
		//Chairs
		WOODEN_CHAIR = new BlockChair(Material.WOOD, SoundType.WOOD, "wooden_chair");
		
		
		//DecoBlocks
		COOKIE_JAR = new CookieJar();
		
	}
	
	public static void register()
	{
		//Ores
		registerBlock(RUBY_ORE);
		registerBlock(SAPPHIRE_ORE);
		registerBlock(COPPER_ORE);
		registerBlock(ALLUMINUM_ORE);
		
		//Normal Blocks
		
		//Stairs
		
		//FenceGates
		
		//Other
		registerBlock(ALTAR);
		
		//Furnace
		registerBlock(QUARTZ_FURNACE);
		registerBlock(LIT_QUARTZ_FURNACE);
		
		//CraftingTables
		
		//Chairs
		registerBlock(WOODEN_CHAIR);
		
		//DecoBlocks
		registerBlock(COOKIE_JAR);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		//Ores
		registerRender(RUBY_ORE);
		registerRender(SAPPHIRE_ORE);
		registerRender(COPPER_ORE);
		registerRender(ALLUMINUM_ORE);
		
		//Normal Blocks
		
		//Stairs
		
		//FenceGate
		
		//Other
		registerRender(ALTAR);
		
		//Furnace
		registerRender(QUARTZ_FURNACE);
		registerRender(LIT_QUARTZ_FURNACE);
		
		//CraftingTables
		
		//Chairs
		registerRender(WOODEN_CHAIR);
		
		//DecoBlocks
		registerRender(COOKIE_JAR);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}