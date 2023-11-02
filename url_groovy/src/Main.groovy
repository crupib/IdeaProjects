import static groovyx.gpars.GParsPool.withPool
static void main(String[] args) {

  def urls = [
          'https://groovy-lang.org',
          'https://www.1728.org/mixture.htm',
          'https://gr8conf.org'

  ]*.toURL()

  println withPool {
    urls.collectParallel {
      it.text.findAll(~/[Gg]roovy/).size()
    }
  }
}