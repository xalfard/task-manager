# 📚 Backend Engineering Ders Defteri

Bu klasör, `task-manager` projesini kurarken öğrendiklerimizin özet sayfalarını tutar.
Her modülün sonunda o modülün **tüm başlıkları birbirine bağlı** olarak tek bir sayfada toplanır.

## Her modül nasıl işliyor?

| Adım | Ne yapıyoruz |
|------|--------------|
| 🎯 **Hedefler** | "Bu modülün sonunda şunu açıklayabileceksin" listesi |
| 🔬 **Kaputun altı** | Sihri kaldıran gerçek deneyler (elle HTTP yazmak, TCP'yi izlemek, thread'leri saymak…) |
| 🛠️ **Uygulama** | Öğrendiğimizi projeye kod olarak eklemek |
| ✅ **Kontrol** | Sorular + ödev |
| 📝 **Özet sayfa** | Bu klasördeki sayfa + commit + push |

## Modüller

| # | Modül | Uygulama | Kaputun altı | Durum |
|---|-------|----------|--------------|-------|
| 0 | [Backend nedir? + İskelet](00-backend-nedir.md) | Spring Boot iskeleti, `/hello` | Derleme zinciri, fat jar, port | ✅ |
| 1 | HTTP derinlemesine | `/tasks` CRUD endpoint'leri (bellekte) | HTTP = TCP üstünde düz metin, `nc` ile elle istek, DNS/TCP handshake | ⏳ Sıradaki |
| 2 | İstek sunucunun içinde | Katmanlar: Controller → Service | Tomcat thread pool, `DispatcherServlet`, process ve thread, eşzamanlılık | ⬜ |
| 3 | REST tasarımı + validation + hata yönetimi | DTO, `@Valid`, standart hata formatı | Idempotency, girdiye neden güvenilmez | ⬜ |
| 4 | Veritabanı | PostgreSQL, JPA, migration (Flyway) | Index nasıl çalışır, transaction, ACID, connection pool | ⬜ |
| 5 | Kimlik doğrulama ve yetkilendirme | Kayıt/giriş, JWT, görev sahipliği | Password hashing, session ve token farkı, stateful ve stateless | ⬜ |
| 6 | Güvenlik | CORS, rate limit, secret yönetimi | SQL injection'ı elle denemek, TLS/HTTPS | ⬜ |
| 7 | Test | Unit + integration test | Test piramidi, Testcontainers | ⬜ |
| 8 | Performans | Pagination, Redis cache | N+1 problemi, cache invalidation, load test | ⬜ |
| 9 | İletişim desenleri | Bildirimler | Polling, long polling, SSE, WebSocket, pub/sub, queue | ⬜ |
| 10 | Gözlemlenebilirlik | Log, metrik, health check | Structured logging, tracing | ⬜ |
| 11 | Deployment | Docker, CI/CD | Reverse proxy, load balancer, ortam config'i | ⬜ |
