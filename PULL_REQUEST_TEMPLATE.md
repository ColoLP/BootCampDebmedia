## 📌 Descripción de la Pull Request

Por favor, proporciona una descripción clara y concisa de los cambios realizados en esta PR.

---

## ✅ Checklist de cambios

Marca con una `x` los elementos que aplican a esta PR:

- [ ] 🚧 Tiene migraciones (`.Migrations` o cambios en entidades)
- [ ] ⚙️ Agrega o modifica variables de entorno
    - [ ] Se actualizó el PR correspondiente en GSM (Google Secret Manager)
- [ ] 🔌 Agrega un nuevo servicio o modifica conexiones a servicios existentes
- [ ] 🐰 Agrega colas nuevas en RabbitMQ o modifica colas existentes
- [ ] 🧾 Modifica la `CustomerConfiguration`

---

## 🧩 Issue relacionada

> Indica el número de Issue relacionado para enlazarlos automáticamente y cerrarlo al hacer merge:
>
> 🔗 Closes #<número_del_issue>

## 🧪 ¿Cómo probar estos cambios?

Describe paso a paso cómo probar los cambios localmente o en un entorno de testing.

```bash
# Comandos útiles para probar
dotnet ef migrations add NombreDeLaMigracion
dotnet run
