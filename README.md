<img src="public/image/papyrus_banner.png" alt="Papyrus">
<div align="center">

[![Download](https://img.shields.io/badge/releases-gold?label=download&style=for-the-badge&colorA=fff6dc&colorB=e0c35c)](https://github.com/kappader4/Papyrus/releases)⠀
[![Github Actions Build](https://img.shields.io/github/actions/workflow/status/YourOrg/Papyrus/build.yml?&style=for-the-badge&colorA=fff6dc&colorB=e0c35c)](https://github.com/kappader4/Papyrus/actions)⠀
[![Discord](https://img.shields.io/discord/1145991395388162119?label=discord&style=for-the-badge&colorA=fff6dc&colorB=e0c35c)](https://discord.gg/gfgAwdSEuM)

**Papyrus** is a high-performance [Leaf](https://github.com/Winds-Studio/Leaf) fork that blends **Fabric mod** support with **plugin compatibility**, while removing redstone-breaking patches for a true **vanilla-like technical experience**.
</div>

> [!WARNING] Papyrus introduces deep changes for mod compatibility and redstone behavior. Back up your world and configs before switching.

**English** | [中文](public/readme/README_CN.md)

## 📜 Features

- **Based on [Leaf](https://github.com/Winds-Studio/Leaf)** and inherits all its performance enhancements
- **Fabric mod support** built-in via integrated loader
- **Plugin and mod compatibility**, simultaneously
- **Removes Bukkit and Paper patches** that interfere with vanilla redstone mechanics
- **Async features** such as pathfinding, mob spawning, and entity tracking
- **Fully compatible** with Spigot, Paper plugins, and Fabric mods
- **Minimalist and modder-friendly**, enabling deeper customization
- **Supports complex redstone and technical builds** like vanilla clients
- **Maintains linear region file format** and debug integration from Leaf
- **Clean and scalable performance base** using Java 21

## 📊 bStats

Coming soon — Papyrus will have its own bStats tracking once publicly deployed.

## 📢 Community & Support

- Discord: [`https://discord.com/invite/gfgAwdSEuM`](https://discord.com/invite/gfgAwdSEuM)

## 💵 Donation

Support the project by sponsoring development or contributing!

## 📥 Download

Download Papyrus from our [GitHub Releases](https://github.com/YourOrg/Papyrus/releases)

**Java 21 or higher is required.**

## 📄 Documentation

Coming soon at: `https://papyrusmc.org/docs`

## 📦 Building

```bash
./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
```

## 🧪 API & Development

Papyrus inherits its API from Leaf, and may extend it in the future to better support mod-plugin interactions. Currently, follow Leaf's API instructions.

## ⚖️ License

- All Papyrus code and patches are licensed under [MIT](licenses/MIT.txt)
- Distributable binaries are under [GPL-3.0](licenses/GPL-3.0.txt)
- Includes contributions and patches from: Paper, Leaf, Gale, Purpur, and other open forks.

## 📜 Credits

Papyrus builds on the amazing work of these projects:

- [Leaf](https://github.com/Winds-Studio/Leaf) (built on Leaf/Gale)
- [Gale](https://github.com/Dreeam-qwq/Gale)
- [Fabric Loader](https://github.com/FabricMC/fabric-loader)
- [Purpur](https://github.com/PurpurMC/Purpur)
- [Pufferfish](https://github.com/pufferfish-gg/Pufferfish)

Additional forks with contributions:
<details>
  <summary>🌿 Expand to see base forks</summary>
  <p>
    • <a href="https://github.com/MiraiMC/Mirai">Mirai</a><br>
    • <a href="https://github.com/KeYiMC/KeYi">KeYi</a><br>
    • <a href="https://github.com/Bloom-host/Petal">Petal</a><br>
    • <a href="https://github.com/Akarin-project/Akarin">Akarin</a><br>
    • <a href="https://github.com/Cryptite/Slice">Slice</a><br>
    • <a href="https://github.com/Samsuik/Sakura">Sakura</a><br>
    • ... and many more
  </p>
</details>

## 🔥 Slogan

**Papyrus**  
Modded freedom meets plugin power
A Leaf fork combining Fabric mod support with high performance and redstone-friendly design

---

> Logo and branding assets can be found in `/public/image/papyrus_logo.png`
