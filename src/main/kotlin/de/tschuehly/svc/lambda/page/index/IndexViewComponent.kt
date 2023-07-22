package de.tschuehly.svc.lambda.page.index


import de.tschuehly.spring.viewcomponent.core.component.ViewComponent
import de.tschuehly.spring.viewcomponent.thymeleaf.ViewContext
import java.util.function.Supplier

@ViewComponent
class IndexViewComponent(): Supplier<ViewContext> {
    override fun get() = ViewContext()
}